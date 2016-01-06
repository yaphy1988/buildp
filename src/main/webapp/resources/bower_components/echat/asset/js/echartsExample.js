function refresh(echarts,id,health){
    
    var myChart = echarts.init(document.getElementById(id));
    var option = {
    	    
    	    series : [
    	        {
    	            name:'业务指标',
    	            type:'gauge',
    	            splitNumber: 10,       // 分割段数，默认为5
    	            axisLine: {            // 坐标轴线
    	                lineStyle: {       // 属性lineStyle控制线条样式
    	                    color: [[0.2, '#228b22'],[0.8, '#48b'],[1, '#ff4500']], 
    	                    width: 8
    	                }
    	            },
    	            axisTick: {            // 坐标轴小标记
    	                splitNumber: 10,   // 每份split细分多少段
    	                length :12,        // 属性length控制线长
    	                lineStyle: {       // 属性lineStyle控制线条样式
    	                    color: 'auto'
    	                }
    	            },
    	            axisLabel: {           // 坐标轴文本标签，详见axis.axisLabel
    	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	                    color: 'auto'
    	                }
    	            },
    	            splitLine: {           // 分隔线
    	                show: true,        // 默认显示，属性show控制显示与否
    	                length :30,         // 属性length控制线长
    	                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
    	                    color: 'auto'
    	                }
    	            },
    	            pointer : {
    	                width : 5
    	            },
    	            title : {
    	                show : true,
    	                offsetCenter: [0, '-40%'],       // x, y，单位px
    	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	                    fontWeight: 'bolder'
    	                }
    	            },
    	            detail : {
    	                formatter:'{value}%',
    	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	                    color: 'auto',
    	                    fontWeight: 'bolder'
    	                }
    	            },
    	            data:[{value: 50, name: ''}]
    	        }
    	    ]
    	};

    	option.series[0].data[0].value = health;
    	myChart.setOption(option, true);
}


var echarts;
var developMode = false;

if (developMode) {}
else {
    // for echarts online home page
    require.config({
        paths: {
            echarts: webPath + '/resources/bower_components/echat/example/www/js'
        }
    });
    launchExample();
}

var isExampleLaunched;
function launchExample() {
   /* if (isExampleLaunched) {
        return;
    }

    // 按需加载
    isExampleLaunched = 1;*/
    require(
        [
            'echarts',
            'echarts/chart/gauge'
        ],
        function (ec) {
            
        	$(".gauge").each(function () {
    	        var id = $(this).attr("id");
    	        var health = $(this).next().val();
    	        var myChart = ec.init(document.getElementById(id));
    	     
    	        var option = {
    	        	    
    	        	    series : [
    	        	        {
    	        	            name:'业务指标',
    	        	            type:'gauge',
    	        	            splitNumber: 10,       // 分割段数，默认为5
    	        	            axisLine: {            // 坐标轴线
    	        	                lineStyle: {       // 属性lineStyle控制线条样式
    	        	                    color: [[0.2, '#8ecb66'],[0.8, '#48b'],[1, '#ff4500']], 
    	        	                    width: 3
    	        	                }
    	        	            },
    	        	            axisTick: {            // 坐标轴小标记
    	        	                splitNumber: 10,   // 每份split细分多少段
    	        	                length :12,        // 属性length控制线长
    	        	                lineStyle: {       // 属性lineStyle控制线条样式
    	        	                    color: 'auto'
    	        	                }
    	        	            },
    	        	            axisLabel: {           // 坐标轴文本标签，详见axis.axisLabel
    	        	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	        	                    color: 'auto'
    	        	                }
    	        	            },
    	        	            splitLine: {           // 分隔线
    	        	                show: true,        // 默认显示，属性show控制显示与否
    	        	                length :30,         // 属性length控制线长
    	        	                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
    	        	                    color: 'auto'
    	        	                }
    	        	            },
    	        	            pointer : {
    	        	                width : 5
    	        	            },
    	        	            title : {
    	        	                show : true,
    	        	                offsetCenter: [0, '-40%'],       // x, y，单位px
    	        	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	        	                    fontWeight: 'bolder'
    	        	                }
    	        	            },
    	        	            detail : {
    	        	                formatter:'{value}',
    	        	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
    	        	                    color: 'auto',
    	        	                    fontWeight: 'bolder'
    	        	                }
    	        	            },
    	        	            data:[{value: 50, name: ''}]
    	        	        }
    	        	    ]
    	        	};

    	        	option.series[0].data[0].value = parseInt(health);
    	        myChart.setOption(option);
    	    });     
        }
    );
}

