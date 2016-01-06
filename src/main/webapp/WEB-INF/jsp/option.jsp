{
    data: '${xml}',
    chart: {
        renderTo: 'chart-container',
        type: 'spline',
        borderRadius: 5
    },
    title: {
        text: '${title}'
    },
    subtitle: {
        text: '${subtitle}'
    },
    colors: config_colors,
    xAxis: {
        type: 'datetime',
        dateTimeLabelFormats: config_timelabelformats
    },
    yAxis: {
        title: {
            text: 'ms'
        }
    },
    tooltip: {
        formatter: function () {
            return '<b>' + this.series.name + '</b><br/>' + Highcharts.dateFormat('%Y-%m-%e %H:%M', this.x) + ' ' + this.y.toFixed(5);
        }
    },
    plotOptions: {
        series: {
            marker: {
                radius: 1
            }
        },
        spline: {
            states: {
                hover: {lineWidth: 4}
            },
            marker: {
                enabled: false
            },
            lineWidth: 2
        }
    },
    series: [],
    intvalue: ${isint}
}