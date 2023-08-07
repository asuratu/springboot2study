package top.jacktgq.controller.utils;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author asura
 */
@Data
@NoArgsConstructor
public class PageResponse<T> {
    // 页码
    private Long page;
    // 每页显示的条数
    private Long size;
    // 总条数
    private Long total;
    // 总页数
    private Long pageNum;
    // 数据
    private List<T> data;

    public PageResponse(Long page, Long size, Long total, Long pageNum, List<T> data) {
        this.page = page;
        this.size = size;
        this.total = total;
        this.pageNum = pageNum;
        this.data = data;
    }

    /**
     * 分页响应
     * @param page 分页对象
     * @return PageResponse<T>
     */
    public PageResponse<T> getPageResponse(Page<T> page) {
        return new PageResponse<>(
                page.getCurrent(),
                page.getSize(),
                page.getTotal(),
                page.getPages(),
                page.getRecords()
        );
    }

}
