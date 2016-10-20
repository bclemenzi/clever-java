package com.evotext.clever.requests;

import java.util.HashMap;
import java.util.Map;

public class ListRequest extends CleverRequest implements CleverRequestInterface{

	protected int limit = 100;
	protected String startingAfter;
	protected String endingBefore;
	protected String where;
	protected boolean count = false;
	
	public int getLimit() {
		return limit;
	}

	public String getStartingAfter() {
		return startingAfter;
	}

	public String getEndingBefore() {
		return endingBefore;
	}

	public String getWhere() {
		return where;
	}

	public boolean isCount() {
		return count;
	}
	
	public Map<String, Object> getParameters()
	{
		Map<String, Object> parameters = new HashMap<>();
		if (count)
		{
			parameters.put("count", "true");
		}
		else
		{
			parameters.put("limit", limit);
			parameters.put("starting_after", startingAfter);
			parameters.put("ending_before", endingBefore);
			parameters.put("where", where);
			parameters.put("count", "false");
		}
		return parameters;
	}

	public static class Builder{
		private int limit;
		private String startingAfter;
		private String endingBefore;
		private String where;
		private boolean count;
		private Map<String, Object> parameters;
		private String token;
		private String url;
		
		public Builder(final String token, final String url)
		{
			this.token = token;
			this.url = url;
		}

		public Builder parameters(Map<String, Object> parameters) {
			this.parameters = parameters;
			return this;
		}

		public Builder token(String token) {
			this.token = token;
			return this;
		}
		


		public Builder limit(int limit) {
			this.limit = limit;
			return this;
		}

		public Builder startingAfter(String startingAfter) {
			this.startingAfter = startingAfter;
			return this;
		}

		public Builder endingBefore(String endingBefore) {
			this.endingBefore = endingBefore;
			return this;
		}

		public Builder where(String where) {
			this.where = where;
			return this;
		}

		public Builder count(boolean count) {
			this.count = count;
			return this;
		}

		public ListRequest build() {
			return new ListRequest(this);
		}
	}

	protected ListRequest(Builder builder) {
		this.limit = builder.limit;
		this.startingAfter = builder.startingAfter;
		this.endingBefore = builder.endingBefore;
		this.where = builder.where;
		this.count = builder.count;
		this.parameters = builder.parameters;
		this.token = builder.token;
		this.url = builder.url;
	}

}
