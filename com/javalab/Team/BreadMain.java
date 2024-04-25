package com.javalab.Team;

public class BreadMain {

    public static void main(String[] args) {
        // 상호명 이외에 모두 임의로 작성하였습니다.
        Bread bread1 = new Bread("성심당", "단팥빵", "대전", 2000, false, false, 4.95);
        Bread bread2 = new Bread("이학순베이커리", "크림빵", "수원", 2500, false, true, 4.45);
        Bread bread3 = new Bread("명장시대", "초코빵", "광명", 1800, true, false, 4.33);
        Bread bread4 = new Bread("가드너스", "몽블랑", "파주", 1800, true, false, 4.74);
        Bread bread5 = new Bread("프로스콘스", "머핀", "안산", 1800, true, false, 4.63);
        Bread bread6 = new Bread("울랄라 베이커리", "소금빵", "청주", 32400, true, false, 4.28);
        Bread bread7 = new Bread("김영모 과자점", "케이크", "서울", 45800, true, false, 4.73);
        Bread bread8 = new Bread("와줘서 고마워", "내가먼저선빵", "서울", 1000000, true, false, 3.50);
        Bread bread9 = new Bread("좋은아침 페스츄리", "옥수수빵", "안산", 1800, true, false, 4.43);
        Bread bread10 = new Bread("더채움케이크", "미역국케이크", "안산", 70000, true, true, 4.36);
        Bread bread11 = new Bread("카캉스", "생일빵", "안산", 10000, false, false, 4.16);
        Bread bread12 = new Bread("리베르테", "007빵", "안산", 6500, false, true, 4.77);
        Bread bread13 = new Bread("플라워팟", "만원빵", "부산", 10000, false, false, 3.38);
        Bread bread14 = new Bread("파리바게트", "식빵", "흥남", 3000, true, false, 4.34);
        Bread bread15 = new Bread("뚜레쥬르", "호밀빵", "부산", 5500, false, false, 3.23);
        Bread bread16 = new Bread("파리크라상", "포카치아", "제주", 7000, true, false, 2.93);
        Bread bread17 = new Bread("베이비베이글", "프레첼", "파주", 4300, true, false, 3.93);
        Bread bread18 = new Bread("프랑소아제과점", "바게트", "춘천", 4500, false, true, 4.13);
        Bread bread19 = new Bread("밀화당", "파운드케이크", "여수", 5700, true, false, 4.23);
        Bread bread20 = new Bread("홍대더베이크", "치아바타", "평양", 4500, true, true, 4.44);
        Bread bread21 = new Bread("커피앤베이크", "맘모쓰빵", "강릉", 6000, true, false, 2.21);
        Bread bread22 = new Bread("평양쟁반국수", "술빵", "이천", 3000, true, false, 1.00);
        Bread bread23 = new Bread("토프레소", "피자빵", "옥천", 4200, true, true, 3.73);
        Bread bread24 = new Bread("에버그린돈까스", "밀빵", "인덕원", 9900, false, false, 2.33);
        Bread bread25 = new Bread("커피앤베이크", "앙버터", "세종", 2900, true, false, 4.53);

        // Bread type 객체 저장 배열
        Bread[] breads = new Bread[25];

        breads[0] = bread1;
        breads[1] = bread2;
        breads[2] = bread3;
        breads[3] = bread4;
        breads[4] = bread5;
        breads[5] = bread6;
        breads[6] = bread7;
        breads[7] = bread8;
        breads[8] = bread9;
        breads[9] = bread10;
        breads[10] = bread11;
        breads[11] = bread12;
        breads[12] = bread13;
        breads[13] = bread14;
        breads[14] = bread15;
        breads[15] = bread16;
        breads[16] = bread17;
        breads[17] = bread18;
        breads[18] = bread19;
        breads[19] = bread20;
        breads[20] = bread21;
        breads[21] = bread22;
        breads[22] = bread23;
        breads[23] = bread24;
        breads[24] = bread25;


        // 전체 빵정보 출력
        System.out.println("상호 \t\t\t\t 빵종류 \t\t\t\t  소재지 \t\t\t\t 가격\t\t\t\t  가게별점 \t\t\t\t");
        for (Bread b : breads) {
            System.out.println(b.store + "\t\t\t\t" + b.type + "\t\t\t\t" + b.storegion + "\t\t\t\t" + b.price + "\t\t\t\t" + b.starpoint);
        }
        System.out.println();
        //안산 소재 빵집 출력
        System.out.println("==========================================================================================");
        System.out.println("안산 지역에 있는 빵 가게들의 정보");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("상호 \t\t\t\t\t\t 빵종류 \t\t\t\t\t\t 가격\t\t\t\t\t\t별점");
        for (Bread b : breads) {
            if (b.storegion.equals("안산")) {
                System.out.println(b.store + "\t\t\t\t\t\t" + b.type + "\t\t\t\t\t\t" + b.price + "\t\t\t\t\t\t" + b.starpoint);
            }
        }
        System.out.println();

        System.out.println("=========================================================================================="); //안산에서 파는 빵은?
        System.out.println("안산 지역 빵집에서 파는 빵의 종류");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Bread b : breads) {
            if (b.storegion.equals("안산")) {
                System.out.print(b.type + "\t\t\t");
            }
        }
        System.out.println();
        System.out.println();

//초코랑 크림이 같이 들어가 있는 빵은?
        System.out.println("==========================================================================================");
        System.out.println("당신이 원하는 그빵, 초코 가득 크림 가득 빵");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("상호 \t\t\t\t\t\t 빵종류 \t\t\t\t\t\t 소재지 \t\t\t\t\t\t 가격\t\t\t\t\t\t 별점");
        for (Bread b : breads) {
            if (b.choco && b.cream) {
                System.out.println(b.store + "\t\t\t\t\t\t" + b.storegion + "\t\t\t\t\t\t" + b.type + "\t\t\t\t\t\t" + b.price + "\t\t\t\t\t\t" + b.starpoint);
            }
        }
        System.out.println();
        // 가격이 가장 높은 빵과 빵의 이름?
        System.out.println("==========================================================================================");
        double maxPrice = 0;
        String No1bread = "";

        for (int i = 0; i < breads.length; i++) {
            if (breads[i].price > maxPrice) {
                maxPrice = breads[i].price;
                No1bread = breads[i].type;
            }
        }
        System.out.println("가장 높은 빵값은 " + maxPrice + " 원입니다");
        System.out.println("그 빵의 이름은 '" + No1bread + "' 입니다");
    }
}