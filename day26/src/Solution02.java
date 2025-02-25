import java.util.Arrays;

public class Solution02 {
    public static void main(String[] args) {
        String sample = "피카츄 라이츄 파이리 꼬부기 " + "버터플 야도란 피죤투 또가스 " + "서로 생긴 모습은 달라도 우리는 모두 친구";
        System.out.println(sample.length());
        System.out.println("sample.substring(10, 40) = " + sample.substring(10, 40));
        String eng = "Pikachyu, Raichyu, Pairi, Kkobugi";
        System.out.println("eng.toUpperCase() = " + eng.toUpperCase());
        System.out.println("eng.toLowerCase() = " + eng.toLowerCase());

        String eng2 = "Pikachyu, Raichyu, Pairi, Kkobugi";
        System.out.println(".split(\", \") = " + eng2.split(", ")); // 주소값 출력
        System.out.println("Arrays.toString(eng2.split(\", \")) = " + Arrays.toString(eng2.split(", ")));

        System.out.println("eng2.toLowerCase().replaceAll(\"they\", \"drake\") = " + eng2.toLowerCase().replaceAll("they", "drake"));
        System.out.println(eng2.toLowerCase().replaceAll("they", "drake").replaceAll("us", "kendrick lamar"));

        String triple = """
                {
                    "name" : "kendrick",
                    "grammy" : true
                }
                """; // 백틱이나 파이썬 3중 큰따옴표와 유사
        System.out.println(triple);
    }
}
