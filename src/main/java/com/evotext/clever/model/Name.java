
package com.evotext.clever.model;

public class Name {

    private String first;
    private String middle;
    private String last;

    /**
     * 
     * @return
     *     The first
     */
    public String getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * 
     * @param middle
     *     The middle
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * 
     * @return
     *     The last
     */
    public String getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    public void setLast(String last) {
        this.last = last;
    }

	@Override
	public String toString() {
		return "Name [first=" + first + ", middle=" + middle + ", last=" + last + "]";
	}

    
}
