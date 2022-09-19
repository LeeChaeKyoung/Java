import java.util.*;
/*class FlowEx1{
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일때, 참인것은 %n",x);

        if(x==0){System.out.println("x==0");}
        if(x!=0){System.out.println("x!=0");}
        if(!(x==0)){System.out.println("!(x==0)");}
        if(!(x!=0)){System.out.println("!(x!=0)");}

        x = 1;
        System.out.printf("x=%d 일때, 참인것은 %n",x);

        if(x==0){System.out.println("x==0");}
        if(x!=0){System.out.println("x!=0");}
        if(!(x==0)){System.out.println("!(x==0)");}
        if(!(x!=0)){System.out.println("!(x!=0)");}
    }
}*/

/*class FlowEx2{
    public static void main(String[] args) {
        int input;

        System.out.print("숫자 하나 입력 : ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input=Integer.parseInt(tmp);

        if(input==0){
            System.out.println("입력한 숫자는 0입니다");
        }
        if(input!=0){
            System.out.printf("입력한 숫자는 0이 아니다%n");
            System.out.printf("입력한 숫자는 %d이다.", input);
        }
    }
}*/

/*class FlowEx4{
    public static void main(String[] args) {
        int score = 0;
        char grade =  ' ' ;

        System.out.print("점수 입력 : ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >=90){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >=70){
            grade = 'c';
        }else if(score >=60){
            grade = 'D';
        }else{
            grade ='F';
    }
    System.out.printf("점수 %d, 학점 : "+grade,score);
}
}*/

/*class FlowEx7{
    public static void main(String[] args) {
        System.out.print("가위바위보 예측 입력(왼쪽, 오른쪽, 비김) : ");
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        int com = (int)(Math.random()*3)+1;
        int com2 = (int)(Math.random()*3)+1;
        
        String RCP = "";
        String RCP2 = "";

        switch(com){
            case 1 : 
            RCP = "가위";
            break;
            case 2:
            RCP = "바위";
            break;
            case 3:
            RCP = "보";
            break;
        }

        switch(com2){
            case 1 : 
            RCP2 = "가위";
            break;
            case 2:
            RCP2 = "바위";
            break;
            case 3:
            RCP2 = "보";
            break;
        }

        System.out.println("왼쪽 : "+RCP+"\n오른쪽 : "+RCP2);

      if((com-com2 == 0) && user.equals("비김")){
        System.out.println("예측 성공");
      }else if(com==1 && com-com2==-2 &&user.equals("왼쪽")){
        System.out.println("예측 성공");
      }else if(com==1 && com-com2==-1 && user.equals("오른쪽")){
        System.out.println("예측 성공");
      }else if(com==2 && com-com2==1 && user.equals("왼쪽")){
        System.out.println("예측 성공");
      }else if(com==2 && com-com2==1 && user.equals("오른쪽")){
        System.out.println("예측 성공");
      }else if(com==3 && com-com2==1 && user.equals("왼쪽")){
        System.out.println("예측 성공");
      }else if(com==3 && com-com2==2 && user.equals("오른쪽")){
        System.out.println("예측 성공");
      }else{
        System.out.println("예측 실패");
      }

    }
}*/

// class Ex4_8{
//   public static void main(String[] args) {
//     int i = 1;

//     for(; i<10;i++){ //초기값 썼으면 생략가능
//       System.out.println(i);
//     }
//   }
// }

/*class Ex4_11{
  public static void main(String[] args) {
    for(int i =0; i<5;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

/*class Ex4_13{
  public static void main(String[] args) {
    int sum = 0;
    int i = 0;
    while(sum<=100){
      sum += i;
      System.out.println(sum);
      i++;
    }
    System.out.println(i-1);
  }
}*/

/*class Ex4_15{
  public static void main(String[] args) {
    int input= 0 , answer= 0 ;

    answer = (int)(Math.random()*100)+1;
    Scanner scanner = new Scanner(System.in);

    do{
      System.out.println("1 ~ 100 사이 정수 :");
      input = scanner.nextInt();

      if(input>answer){
        System.out.println("더 작은수 입력 필요");
      }else if(input<answer){
        System.out.println("더 큰 수를 입력");
      }
    }while(input!=answer);
    System.out.println("정답");
  }
}*/

class Ex4_16{
  public static void main(String[] args) {
    int menu= 0, num = 0;

    Scanner scanner = new Scanner(System.in);
    
    outer:
    while(true){
      System.out.println("(1) 제곱");
      System.out.println("(2) 제곱근");
      System.out.println("(3) 로그");
      System.out.println("원하는 메뉴(1~3) 선택. (종료는 0)");

      String tmp = scanner.nextLine();
      menu = Integer.parseInt(tmp);

      if(menu==0){
        System.out.println("프로그램 종료");
        break;
      } else if(!(1<=menu && menu<=3)){
        System.out.println("없는 메뉴입니다. (종료는 0)");
        continue;
      }

      for(;;){
        System.out.print("계산할 값 입력.(계산종료 : 0, 전체종료 : 99) :");
        tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);
        
        if(num==0)
        break;

        if(num==99)
        break outer;
        switch(menu){
          case 1 :
            System.out.println("result : "+ num*num);
            break;
          case 2 :
            System.out.println("result : "+Math.sqrt(num));
            break;
          case 3 :
            System.out.println("result : "+Math.log(num));
            break;
        }
      }


    }
  }
}