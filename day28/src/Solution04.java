import java.util.Random;

public class Solution04 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        // 매번 새로운 카운터 생기는 것
        counter1.increment();
        counter2.increment();
        counter1.increment();
        // counter1, counter2가 별도의 객체라서 연동이 안되는데...
        System.out.println("counter1.getCounter() = " + counter1.getCounter());
        System.out.println("counter2.getCounter() = " + counter2.getCounter());
//        SingletonCounter singletonCounter = new SingletonCounter();
        SingletonCounter singletonCounter1 = SingletonCounter.getInstance();
        SingletonCounter singletonCounter2 = SingletonCounter.getInstance();
        singletonCounter1.decrement();
        singletonCounter2.decrement();
        singletonCounter1.decrement();
        // static memory에 탑재된 동일한 인스턴스를 꺼내다 쓰는 개념이라...
        // 둘이 서로 다른 존재일 필요가 없다면... 객체를 하나만 써서 만들어서
        // 1. 메모리를 아끼거나 2. 상태를 통합해서 관리
        System.out.println("singletonCounter1.getCounter() = " + singletonCounter1.getCounter());
        System.out.println("singletonCounter2.getCounter() = " + singletonCounter2.getCounter());
        // 일반적인 자바 웹 서버 프레임워크들은 이 과정을 알아서 합니다.
        // 굳이 설정 안하면 Singleton으로 구현하고 관리를 함.
        // 그래서 알아야지... 그래서 알아야지...

//        KoreanBaseballTeam team = KoreanBaseballTeam.LG;
        Random rand = new Random();
        int teamNumber = rand.nextInt(KoreanBaseballTeam.values().length);
        KoreanBaseballTeam team = KoreanBaseballTeam.values()[teamNumber];
        System.out.println(team);
        System.out.println("주장은 " + team.getCaptainName());
        switch (team) {
            case LG:
                System.out.println("백색가전이 유명하다");
                break;
            case KT:
                System.out.println("전국민 상대로 구독장사를 하고 있다");
                break;
            case KIA:
                System.out.println("왠지 강해졌다");
                break;
            case  SAMSUNG:
                System.out.println("생각보다 은근히 상위권에 자주 보인다");
                break;
            case DOOSAN:
                System.out.println("아! 두산 왕조의 영광이여...");
                break;
        }
    }
}

enum KoreanBaseballTeam {
    KIA("나성범"),
    SAMSUNG("구자욱"),
    LG("박해민"),
    DOOSAN("양의지"),
    KT("장성우");
    // Switch와 많이 쓰임 -> Switch 1 대 1 대응
    // 나열되어 있는 값

    private final String captainName;

    KoreanBaseballTeam(String captainName) {
        this.captainName = captainName; // 생성자를 통해 넣어주는 것
    }

    public String getCaptainName() {
        return captainName;
    }
}

class SingletonCounter {
    // 일반적인 생성자로 만들 생각이 없다
    private SingletonCounter() {}
    // static 메모리에 직접 집어넣겠다.
    private static SingletonCounter instance;

    public static SingletonCounter getInstance() {
        if (instance == null) { // 없으면 만들고
            instance = new SingletonCounter();
        }
        return instance; // 해당 인스턴스를 리턴하겠다.
    }

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}


class Counter {
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public int getCounter() {
        return counter;
    }
}
