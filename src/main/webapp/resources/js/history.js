var ctx, hostid, period, serviceid;

Highcharts.setOptions({
    global: {
        useUTC: false
    }
});

//noinspection JSUnusedGlobalSymbols
var config_timelabelformats = {
    //时间格式配置
    second: '%H:%M',
    minute: '%H:%M',
    hour: '%H:00',
    day: '%m月%d日',
    week: '%m-%d',
    month: '%y-%m',
    year: '%Y年'
};

//noinspection JSUnusedGlobalSymbols
var config_colors = ['#4572A7', '#AA4643', '#89A54E', '#80699B', '#3D96AE', '#DB843D', '#92A8CD', '#A47D7C', '#B5CA92'];

function drawchart(options) {
    $.ajax({
        type: "GET",
        url: ctx + options.data,
        dataType: "xml",
        success: function (xml) {
            //options.yAxis.title.text = $(xml)
            $(xml).find("entry").each(function () {
                var seriesOptions = {
                    name: $(this).text(),
                    data: []
                };
                options.series.push(seriesOptions);
            });

            $(xml).find("row").each(function () {
                var t = parseInt($(this).find("t").text()) * 1000;

                $(this).find("v").each(function (index) {
                    var v = options.intvalue ? parseInt($(this).text()) : parseFloat($(this).text());
                    v = v || null;
                    if (v != null) {
                        options.series[index].data.push([t, v])
                    }
                });
            });
            new Highcharts.Chart(options);
        }
    })
}

function index(button) {
    var buttonid = button.attr("id");
    var ttid = buttonid.split('_');
    return ttid[ttid.length - 1];
}

function change(status, parentid, newclass) {
    $("#" + parentid).find("button").each(function () {
        var sid = index($(this));
        if (sid != status) {
            $(this).removeClass(newclass);
            $(this).addClass("btn-default");
        } else {
            $(this).removeClass("btn-default");
            $(this).addClass(newclass);
        }
    });
}

$(document).ready(function () {
    var optionurl = ctx + "chart/options/" + hostid + "/";
    change(period, "periodgroup", "btn-primary");
    $.ajax({
        url: optionurl + serviceid,
        success: function (data) {
            var options = eval("(" + data + ")");
            drawchart(options);
            $("#navgroup").children().each(function () {
                var sid = index($(this));
                $(this).click(function () {
                    if (sid && sid != serviceid) {
                        serviceid = sid;
                        $.ajax({
                            url: optionurl + serviceid + '?p=' + period,
                            success: function (data) {
                                var options = eval("(" + data + ")");
                                drawchart(options);
                                change(serviceid, "navgroup", "btn-success");
                            }
                        });
                    }
                });
            });
            $("#periodgroup").children().each(function () {
                var sid = index($(this));
                $(this).click(function () {
                    if (sid != period) {
                        period = sid;
                        change(period, "periodgroup", "btn-primary");
                        $.ajax({
                            url: optionurl + serviceid + '?p=' + period,
                            success: function (data) {
                                var options = eval("(" + data + ")");
                                drawchart(options);
                                change(serviceid, "navgroup", "btn-primary");
                            }
                        });
                    }
                });
            });
            change(serviceid, "navgroup", "btn-success");
        }
    });
});