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

	public int GetFirstIndex(int pageNumber, long recordsCount) {
		int firstIndex = 0;
		int tempPagesCount;
		this.recordsCount = recordsCount;
		if (recordsCount <= 0 || pageNumber <= 0) {
			return 0;
		}
		tempPagesCount = (int) (recordsCount / recordEachPage);
		tempPagesCount += recordsCount % recordEachPage > 0 ? 1 : 0;
		// System.out.println(tempPagesCount);
		this.pagesCount = tempPagesCount;
		int pageIndex;
		if (pageNumber <= this.pagesCount) {
			pageIndex = pageNumber - 1;
		} else {
			pageIndex = this.pagesCount - 1;
		}
		// System.out.println(pageIndex);
		this.currentPage = pageIndex + 1;
		firstIndex = pageIndex * recordEachPage;
		return firstIndex;
	}

	public int GetMaxResults() {
		return this.recordEachPage;
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
