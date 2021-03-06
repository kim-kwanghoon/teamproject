package mc.admin.model;

import java.util.ArrayList;
import java.util.List;

import mc.admin.service.Paging1;

public class AttenListModel {

		private int count;//전체 글 수
		private List<AttenDto> boardList;//현재 페이지에서 보여줄 글
		private int requestPage;//요청 페이지 번호
		private int totalPageCount;//전체 페이지 수
		private int startRow;//현재 페이지의 첫번째 글 번호
		private Paging1 p;
		
		
		public AttenListModel() {
			this(new ArrayList<AttenDto>(), 0, 0, 0, new Paging1(),0);	
		}
		
		public AttenListModel(List<AttenDto> boardList, int requestPage, int totalPageCount, int startRow, Paging1 p,int count) {
			super();
			this.boardList = boardList;
			this.requestPage = requestPage;
			this.totalPageCount = totalPageCount;
			this.startRow = startRow;
			this.p = p;
			this.count = count;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public List<AttenDto> getBoardList() {
			return boardList;
		}

		public void setBoardList(List<AttenDto> boardList) {
			this.boardList = boardList;
		}

		public int getRequestPage() {
			return requestPage;
		}

		public void setRequestPage(int requestPage) {
			this.requestPage = requestPage;
		}

		public int getTotalPageCount() {
			return totalPageCount;
		}

		public void setTotalPageCount(int totalPageCount) {
			this.totalPageCount = totalPageCount;
		}

		public int getStartRow() {
			return startRow;
		}

		public void setStartRow(int startRow) {
			this.startRow = startRow;
		}

		public Paging1 getP() {
			return p;
		}

		public void setP(Paging1 p) {
			this.p = p;
		}
		
		
		
		
		
		
	}


