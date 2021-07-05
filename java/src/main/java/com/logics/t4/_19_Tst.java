package com.logics.t4;

public class _19_Tst {
    public static void main(final String[] args) {
        final boolean flag1 = false;

        final Boolean flag2 = Boolean.parseBoolean("false");

        final boolean flag3 = !true;

        final Boolean flag4 = 100 == 20;

        final boolean flag5 = 10 >= 20;

        final Boolean flag6 = false;

        while (flag1) { System.out.println("this is unreachable code with compile error"); break;  }

        while (flag5) { System.out.println("this is unreachable code with compile error"); break;  }        

        while (flag3) { System.out.println("this is unreachable code with compile error"); break;  }
        
        while (flag2) { System.out.println("this is uncreachable code without compile error"); break;  }

        while (flag4) { System.out.println("this is uncreachable code without compile error"); break;  }

        while (flag6) { System.out.println("this is uncreachable code without compile error"); break;  }

        while (Boolean.FALSE) { System.out.println("this is uncreachable code without compile error"); break;  }

    }
}
