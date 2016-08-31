
package com.evotext.clever;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first",
    "middle",
    "last"
})
public class Name {

    @JsonProperty("first")
    private String first;
    @JsonProperty("middle")
    private String middle;
    @JsonProperty("last")
    private String last;

    /**
     * 
     * @return
     *     The first
     */
    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    /**
     * 
     * @param first
     *     The first
     */
    @JsonProperty("first")
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     The middle
     */
    @JsonProperty("middle")
    public String getMiddle() {
        return middle;
    }

    /**
     * 
     * @param middle
     *     The middle
     */
    @JsonProperty("middle")
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * 
     * @return
     *     The last
     */
    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    /**
     * 
     * @param last
     *     The last
     */
    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }

	@Override
	public String toString() {
		return "Name [first=" + first + ", middle=" + middle + ", last=" + last + "]";
	}

    
}
