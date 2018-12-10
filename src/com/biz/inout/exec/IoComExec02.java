package com.biz.inout.exec;

import java.util.*;

import com.biz.inout.vo.*;
import com.biz.service.*;

public class IoComExec02 {

	public static void main(String[] args) {
		
		IoComeService is = new IoComeService();
		// Scanner scanner = new Scanner(System.in);

		while (true) {
			IoComeVO vo = ioInsert();
			
			if (vo == null)
				break;
			is.inOutInsert(vo);// List에 추가하라고 vo를 전달
			
		}
		is.ioListPrint();
	}

	public static IoComeVO ioInsert() {
		IoComeVO vo = new IoComeVO();
		Scanner scan = new Scanner(System.in);
		System.out.println("===========");
		System.out.println("매입 매출 등록");
		System.out.println("-----------");
		System.out.println("거래일(-1:종료) >>>");
		String strDate = scan.nextLine();

		if (strDate.equals("-1")) {
			return null;
			// 나머지 코드를 실행하지 말고 중단.
		} // 종료코드

		System.out.print("거래방법(매입/매출) >>>");
		String strInOut = scan.nextLine();

		System.out.print("품목(상품명)>>>");
		String strPum = scan.nextLine();

		System.out.print("단가 >>>");
		String strDan = scan.nextLine();
		int intDan = Integer.valueOf(strDan);

		System.out.print("수량 >>>");
		String strSu = scan.nextLine();
		int intSu = Integer.valueOf(strSu);

		vo.setStrDate(strDate);
		vo.setStrInout(strInOut);
		vo.setStrPum(strPum);
		vo.setIntDan(intDan);
		vo.setIntSu(intSu);

		return vo;
	}
}

// is.ioListPrint();
// is.ioListPrint();
// IoComeVO vo = new IoComeVO();
// vo.setStrDate("2018-12-07");
// vo.setStrInout(strInout);
