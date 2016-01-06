/**
 * 
 */
$(function() {
	var element = $('#page-element');
	var pageIndex = element.data("pageindex");
	var pageSize = element.data("pagesize");
	var total = element.data("total");
	var pages = Math.ceil(total / pageSize);
	if(pages==0) pages=1;
	var numberOfPages = pages > 7 ? 7 : pages;

	var options = {
		bootstrapMajorVersion : 3,
		currentPage : pageIndex,
		numberOfPages : numberOfPages,
		totalPages : pages,
		onPageClicked : function(e, originalEvent, type, page) {
			pagerClick(page);
		}
	}

	element.bootstrapPaginator(options);
});