/**
 * region-selector.js
 * 从数据库动态加载的方式生成行政区域下拉框。基于bootstrap-select
 * author:yaphy
 */
(function($) {
	
	var Region = function (element, options) {
        this.init(element, options);
        this.getRegionValue = Region.prototype.getRegionValue;
    },
        old = null;
    var ajaxUrl = getRootPath() + "base/getregion";
	var provinceElem = null;
	var cityElem = null;
	var countyElem = null;
	
    Region.prototype = {
    	init: function (element, options) {
    		this.$element = $(element);
    		var that = this.$element;
    		defaultRegion = that.data("regioncode");
    		if (defaultRegion != undefined) {
    			$.fn.region.defaults.regionCode = defaultRegion.toString();
    		}
    		this.setOptions(options);
    	
    		//插入3个空的下拉框
    		that.append("<select id='province' class='selectpicker' data-live-search='true'></select>");
    		that.append("<select id='city' class='selectpicker' data-live-search='true'></select>");
    		that.append("<select id='county' class='selectpicker' data-live-search='true'></select>");
    		
    		provinceElem = that.find("select").eq(0);
    		cityElem = that.find("select").eq(1);
    		countyElem = that.find("select").eq(2);
    		
    		renderSelector(this.options.regionCode);
    		provinceElem.bind("change",changeProvince);
    		cityElem.bind("change",changeCity);
    	},
    	setOptions: function (options) {
    		this.options = $.extend({}, (this.options || $.fn.region.defaults), options);
    	},
    	setRegionCode: function (regionCode) {
    		this.regionCode = regionCode;
    	},
    	getRegionValue: function () {
    		
    		return countyElem.find("option:selected").val();
    	}
	}
	
	$.fn.region = function(option) {
    	
    	var args = arguments,
        result = null;
    	$(this).each(function (index, item) {
            var $this = $(item),
                data = $this.data('region'),
                options = (typeof option !== 'object') ? null : option;
            if(!data){
            	data = new Region(this, options);
                $this = $(data.$element);
                $this.data('region', data);
                return;
            }
            

            if (typeof option === 'string') {
                if (data[option]) {
                    result = data[option].apply(data, Array.prototype.slice.call(args, 1));
                } else {
                    throw "Method " + option + " does not exist";
                }

            } else {
                result = data.setOptions(option);
            }
        });
        return result;
	};
	
	old = $.fn.region;
	
	$.fn.region.defaults = {
		regionCode:"000000"
	};
	$.fn.region.Constructor = Region;
	
	function changeProvince(){
		var selectValue = $(this).val();
		if (selectValue == undefined || selectValue == "000000") {
			selectValue = "000000";
			cityElem.empty();
			cityElem.append("<option value='"+selectValue+"'>--请选择--</option>");
			countyElem.empty();
			countyElem.append("<option value='"+selectValue+"'>--请选择--</option>");
			cityElem.selectpicker('refresh');
			countyElem.selectpicker('refresh');
			return;
		}
		var param = {
			regionCode: selectValue
		};
		ajaxGet(true,param,ajaxUrl,cityElem,null);
		countyElem.empty();
		countyElem.append("<option value='"+selectValue+"'>--请选择--</option>");
		countyElem.selectpicker('refresh');
	};
	
	function changeCity(){
		var selectValue = $(this).val();
		if (selectValue == undefined) return;
		if (selectValue.substring(2) == "0000") {
			countyElem.empty();
			countyElem.append("<option value='"+selectValue+"'>--请选择--</option>");
			countyElem.selectpicker('refresh');
			return;
		}
		var param = {
			regionCode: selectValue
		};
		ajaxGet(true,param,ajaxUrl,countyElem,null);
		
	};
	
	function renderSelector(param){
		/**初始化“省份”选择框**/
		var queryParam = {
				regionCode: "000000"
			};
		var selectProv = param.substring(0,2);
		var currentProvince = param.substring(0,2)+"0000";
		ajaxGet(true,queryParam,ajaxUrl,provinceElem,currentProvince);
		
		/**初始化“地市”选择框，如果默认没有选中省分，后面两个都不需要初始化**/
		if (selectProv == "00") {
			cityElem.append("<option value='"+currentProvince+"'>--请选择--</option>");
			countyElem.append("<option value='"+currentCounty+"'>--请选择--</option>");
			cityElem.selectpicker('refresh');
			countyElem.selectpicker('refresh');
			return;
		}
		var queryParam = {
			regionCode: currentProvince
		};
		var selectCity = param.substring(2,4);
		var currentCity = param.substring(0,4)+"00";
		ajaxGet(true,queryParam,ajaxUrl,cityElem,currentCity);
		
		/**初始化“区县”选择框**/
		if (selectCity == "00") {
			countyElem.append("<option value='"+currentCounty+"'>--请选择--</option>");
			countyElem.selectpicker('refresh');
			return;
		}
		var queryParam = {
				regionCode: currentCity
			};
		var currentCounty = param;
		ajaxGet(true,queryParam,ajaxUrl,countyElem,currentCounty);
	};
	
	/**ajax查询行政区域数据，填充对应的select下拉框**/
	function ajaxGet(asyncFlag,param,ajaxUrl,selectElem,currentRegion) {
		selectElem.empty();
		selectElem.append("<option value='"+param.regionCode+"'>--请选择--</option>");
		$.ajax({
			async : asyncFlag,
			type : "POST",
			data : param,
			url : ajaxUrl,
			success: function(data){
				
				var json = $.parseJSON(data);
				if (json && json.RES_RESULT == "SUCCESS") {
					var region = json.RES_DATA.aData;
					for (i = 0; i < region.length; i++) {
						if (currentRegion == region[i].regionCode) {
							selectElem.append("<option value='"
									+ region[i].regionCode + "' selected>"
									+ region[i].regionName + "</option>");
						} else {
							selectElem.append("<option value='"
									+ region[i].regionCode + "'>"
									+ region[i].regionName + "</option>");
						}
					}
				}
				selectElem.selectpicker('refresh');
			}
		});
	};
	
})(jQuery);