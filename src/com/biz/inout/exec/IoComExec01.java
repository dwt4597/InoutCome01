package com.biz.inout.exec;

import java.util.*;

import com.biz.inout.vo.*;
import com.biz.service.*;

public class IoComExec01 {
// 02로 ㄱㄱㄱㄱ
	public static void main(String[] args) {
		IoComeService is = new IoComeService();
		// Scanner scanner = new Scanner(System.in);
		IoComeVO vo = new IoComeVO();
		// vo에 담기는 값은, 완성된 vo이거나,
		// null값(if문)

		while (true) {
			vo = ioInsert();
			System.out.println(vo);
			/*if (vo != null) {
				if (vo.getStrDate().equals("-1")) {
					System.out.println("종료합니다.");
					break;
				}
				// 변환 과정에서 오류가 있었으면
				if (vo.getIntDan() < 0 || vo.getIntSu() < 0) {
					System.out.println("단가나 수량 입력 오류");
					continue;
				}
				is.inOutInsert(vo);
			}*/
		}
		// is.ioListPrint();
		// System.out.println(vo);

		// vo.setStrDate("2018-12-10");
		// // vo.setStrPum(scanner.nextLine());
		// vo.setStrInout("매입");
		// vo.setStrPum("새콤달콤");
		// // vo.setStrPum("매출");
		//// vo.setIntSu((int) (Math.random() * (100 - 50 + 1)) + 50);
		//// vo.setIntDan((int) (Math.random() * (100 - 50 + 1)) + 50);
		// vo.setIntSu(20);
		// vo.setIntDan(10);
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
			return vo;
		} // 종료코드

		System.out.print("거래방법(매입/매출) >>>");
		String strInOut = scan.nextLine();

		System.out.print("품목(상품명)>>>");
		String strPum = scan.nextLine();

		try {
			System.out.print("단가 >>>");
			String strDan = scan.nextLine();
//			vo.setIntDan(-1);
			int intDan = Integer.valueOf(strDan);

			System.out.print("수량 >>>");
			String strSu = scan.nextLine();
//			vo.setIntSu(-1);
			int intSu = Integer.valueOf(strSu);

			vo.setStrDate(strDate);
			vo.setStrInout(strInOut);
			vo.setStrPum(strPum);
			vo.setIntDan(intDan);
			vo.setIntSu(intSu);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력오류");
			return null;
		}

		return vo;
	}
}

// is.ioListPrint();
// is.ioListPrint();
// IoComeVO vo = new IoComeVO();
// vo.setStrDate("2018-12-07");
// vo.setStrInout(strInout);
