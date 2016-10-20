
package com.evotext.clever;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Paging {

    private Integer current;
    private Integer total;
    private Integer count;

    /**
     *
     * @return
     *     The current
     */
    public Integer getCurrent() {
        return current;
    }

    /**
     *
     * @param current
     *     The current
     */
    public void setCurrent(Integer current) {
        this.current = current;
    }

    /**
     *
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     *
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
