package lang.math.test;

import java.util.Random;

// 로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
// 로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
// 각 숫자는 중복되면 안된다.
// 실행할 때 마다 결과가 달라야 한다.
public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNums;
    private int count;

    int[] generateNum() {
        lottoNums = new int[6];
        count = 0;

        // 여기서 fori로 하면
        // 중복되는 값이 나왔을 때, 6개의 로또 번호가 다 발급되지 않음!
        // 따라서 while로 ㄱㄱ
        while (count < 6) {
            int k = random.nextInt(45) + 1;
            if (isUnique(k)) {
                lottoNums[count] = k;
                count++;
            }
        }
        return lottoNums;
    }

    // 같은 숫자가 나올 수 있으니 중복 체크를 해줘야 함
    private boolean isUnique(int num) {
        for (int i = 0; i < count; i++) {
            if (lottoNums[i] == num) {
                return false;
            }
        }
        return true;
    }

}
