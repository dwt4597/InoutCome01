package com.biz.service;

import java.util.*;

import com.biz.inout.vo.*;

public class IoComeService {
	List<IoComeVO> ioList;
	IoComeVO vo = new IoComeVO();

	public IoComeService() {
		ioList = new ArrayList();
	}

	public void inOutInsert(IoComeVO vo) {
		// int intSu = vo.getIntSu();
		// int intDan = vo.getIntDan();
		int intTotal = vo.getIntSu() * vo.getIntDan();
		vo.setIntTotal(intTotal);
		this.ioList.add(vo);
	}

	public void ioListPrint() {
		System.out.println("매입리스트");
		System.out.println("==========================================");
		System.out.println("거래일자\t구분\t품목\t수량\t단가\t 합계\t");
		System.out.println("------------------------------------------");
		for (IoComeVO vo : ioList) {
			if (vo.getStrInout().equals("매입")) {

				System.out.printf("%s\t %s\t %s\t %d\t %d\t %d\n", vo.getStrDate(), vo.getStrInout(), vo.getStrPum(),
						vo.getIntSu(), vo.getIntDan(), vo.getIntTotal());

			}
		}
		System.out.println("매출리스트");
		System.out.println("==========================================");
		System.out.println("거래일자\t구분\t품목\t수량\t단가\t 합계\t");
		System.out.println("------------------------------------------");
			
		for (IoComeVO vo : ioList) {
			if (vo.getStrInout().equals("매출")) {
				
			System.out.printf("%s\t %s\t %s\t %d\t %d\t %d\n", vo.getStrDate(), vo.getStrInout(), vo.getStrPum(),
					vo.getIntSu(), vo.getIntDan(), vo.getIntTotal());
			// ioList.get(0).getIntDan();
			}
		}
	}

	public void viewInoutTotal() {
		for (IoComeVO vo : ioList) {

			if (vo.getStrInout().equals("매입")) {
				int intSum = vo.getIntTotal();

			} else if (vo.getStrInout().equals("매출")) {
				int intSum = vo.getIntTotal();

			} else {
				System.out.println("다시입력하세요");
				// ioListPrint();
			}
			System.out.println("==================");
			System.out.println("총 매입 합계 : ");
			System.out.println("총 매출 합계 : ");
			System.out.println("이익금 :");
			System.out.println("==================");

		}
	}
}
