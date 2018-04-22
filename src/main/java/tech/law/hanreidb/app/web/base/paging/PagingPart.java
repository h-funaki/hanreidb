package tech.law.hanreidb.app.web.base.paging;

import org.dbflute.Entity;
import org.dbflute.cbean.result.PagingResultBean;
import org.lastaflute.web.validation.Required;

public class PagingPart {

    /**  */
    @Required
    public Integer all_record_count;

    @Required
    public Integer all_page_count;

    @Required
    public Integer current_page_number;

    @Required
    public Integer current_page_size;

    public boolean exists_next_page;

    public Integer next_page_number;

    public boolean exists_previous_page;

    public Integer previous_page_number;

    public PagingPart(PagingResultBean<? extends Entity> page) {
        this.current_page_size = page.getPageSize();
        this.current_page_number = page.getCurrentPageNumber();
        this.all_record_count = page.getAllRecordCount();
        this.all_page_count = page.getAllPageCount();
        this.exists_next_page = page.existsNextPage();
        if (page.existsNextPage()) {
            this.next_page_number = page.getNextPageNumber();
        }
        this.exists_previous_page = page.existsPreviousPage();
        if (page.existsPreviousPage()) {
            this.previous_page_number = page.getPreviousPageNumber();
        }
    }
}
