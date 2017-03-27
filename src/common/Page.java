package common;

public class Page {
	private int recordEachPage;
	private int currentPage;
	private int pagesCount;
	private long recordsCount;
	private String pageName;
	private String className;

	public int getRecordEachPage() {
		return recordEachPage;
	}

	public void setRecordEachPage(int recordEachPage) {
		this.recordEachPage = recordEachPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}

	public long getRecordsCount() {
		return recordsCount;
	}

	public void setRecordsCount(long recordsCount) {
		this.recordsCount = recordsCount;
	}

	public String getPageName() {
		return pageName;
	}

	public String getClassName() {
		return className;
	}

	public Page() {
		// TODO Auto-generated constructor stub
	}

	public Page(int recordEachPage, String tableName) {
		this.recordEachPage = recordEachPage;
		this.pageName = tableName;
		this.className = tableName;
	}

	public Page(int recordEachPage, String pageName, String className) {
		this.recordEachPage = recordEachPage;
		this.pageName = pageName;
		this.className = className;
	}

}
