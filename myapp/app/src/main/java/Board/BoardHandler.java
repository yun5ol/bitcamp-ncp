package bitcamp.myapp;

import java.sql.Date;

public class BoardHandler {

  static final int SIZE = 100;

  int count;
  Board[] boards = new Board[SIZE];

  void inputBoard() {
    Board b = new Board();
    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.detail = Prompt.inputString("내용? ");
    b.password = Prompt.inputString("암호? ");
    b.viewCnt = new Count(boardViewCnt()).toString();
    b.writedDate = new Date(System.currentTimeMillis()).toString();
  }

  void boardViewCnt() {
  

  }



  void printBoards() {
    System.out.println("번호\t제목\t작성일\t조회수");

    for (int i = 0; i < this.count; i++) {
      Board b = this.boards[i];
      System.out.printf("%d\t%s\t%s\t%s\n",
          b.no, b.title, b.writedDate, b.viewCnt) 
    }
  }

  void printBoard() {
    int inputPassword = Prompt.inputInt("비밀번호? ");

    Board b = this.findByPassword(inputPassword);

    if (b == null) {
      System.out.println("비밀번호가 틀렸습니다.");
      return;
    }

    System.out.printf("    번호: %s\n", m.no);
    System.out.printf("    제목: %s\n", m.title);
    System.out.printf("    내용: %s\n", m.detail);
    System.out.printf("  작성일: %s\n", m.writedDate);
    System.out.printf("  조회수: %s\n", m.viewCnt);
  }

  void modifyBoard() {
    int inputPassword = Prompt.inputInt("비밀번호? ");

    Board b = this.findByPassword(inputPassword);

    if (b == null) {
      System.out.println("비밀번호가 틀렸습니다.");
      return;
    }

      Board b = new Board();
      b.no = old.no;
      b.writedDate = old.createdDate;
      b.title = Prompt.inputString(String.format("제목(%s)? ", old.title));
      b.detail = Prompt.inputString(String.format("내용(%s)? ", old.detail));
      //b.viewCnt = new Count(System.boardViewCnt()).toString();
  
      String str = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
      if (str.equalsIgnoreCase("Y")) {
        this.boards[this.indexOf(old)] = b;
        System.out.println("변경했습니다.");
      } else {
        System.out.println("변경 취소했습니다.");
      }
    }


  void deleteMember() {
    int inputPassword = Prompt.inputInt("비밀번호? ");

    Board b = this.findByPassword(inputPassword);

    if (b == null) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    String str = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!str.equalsIgnoreCase("Y")) {
      System.out.println("삭제 취소했습니다.");
      return;
    }

    for (int i = this.indexOf(ㅠ) + 1; i < this.count; i++) {
      this.boards[i - 1] = this.boards[i];
    }
    this.boards[--this.count] = null; 
    System.out.println("삭제했습니다.");

  }

  void service() {
    while (true) {
      System.out.printf("[게시판 메뉴]");
      System.out.println("1. 입력");
      System.out.println("2. 목록");
      System.out.println("3. 조회");
      System.out.println("4. 변경");
      System.out.println("5. 삭제");
      System.out.println("9. 종료");
      int menuNo = Prompt.inputInt("메뉴> ");

      switch (menuNo) {
        case 9: return;
        case 1: this.inputBoard(); break;
        case 2: this.printBoards(); break;
        case 3: this.printBoard(); break;
        case 4: this.modifyBoard(); break;
        case 5: this.deleteBoard(); break;
        default:
          System.out.println("잘못된 메뉴 번호 입니다.");
      }
    }
  }
}
