## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

--Domain--
TestResult : 결과를 담는다(strike, ball의 개수)
Balls : 정답/사용자 입력을 담는 3개짜리 컬렉션
Ball : Balls에 담기는 각각의 공(숫자)
BallStatus(enum) : Strike/Ball/Nothing

--Todo List--
-UI-
[] 입력을 위한 UI
[] 출력을 위한 UI

-Logic-
[] 정답을 만드는 로직(랜덤한 1-9까지의 수 3개로 구성)
[] Input과 Output을 비교하는 로직(스트라이크, 볼의 개수를 계산) [Balls] GameResult compare(Balls balls)
    [x] Input의 공 하나와 Answer를 비교하는 로직 [Ball] BallStatus compare(Balls balls)
        [x] 두 개의 공을 비교하는 로직 [Ball] BallStatus compare(Ball ball)