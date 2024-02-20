# java-ladder

사다리 타기 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

---
## 용어 정의
- 디딤판(line): 사다리 기둥 사이를 연결하는 발판을 의미한다.
- 디딤판 존재여부(exist): 디딤판이 존재하는지를 나타낸다. true이면 디딤판이 있고, false이면 없다.
- 사다리층(layer): 사다리의 각 층을 의미한다.

## 구현할 기능 목록
### 입력
- [ ] 참여할 사람 이름을 입력받는다.
  - [ ] 쉼표로 구분한다.
  - [x] 참여할 사람은 두명 이상이어야한다.
  - [x] 이름은 최대 다섯글자까지 입력 가능하다.
  - [x] 이름은 중복될 수 없다.
- [ ] 최대 사다리 높이를 입력받는다.
  - [ ] 사다리 높이는 숫자이어야한다.
  - [ ] 사다리 높이는 1 이상이어야한다.
- [ ] 사용자가 잘못된 입력을 하면 해당 부분부터 다시 입력받는다.

### 사다리 생성
- [ ] 각 사다리층에는 (참여자수 - 1)개 만큼의 디딤판을 생성할 수 있는 공간이 있다.
  - [ ] 디딤판 존재여부는 true, false 중 랜덤으로 결정된다.
  - [ ] 디딤판이 같은 층에서 연속해서 생성되지 않도록 한다.

### 사다리 출력
- [ ] 사람 이름을 5자 기준으로 출력한다.
- [ ] 사다리를 출력한다.

## 부록
### 구현 포인트
> TDD 연습을 위해 TDD Cycle에 따라 실패하는 테스트, 프로덕션 코드, 리팩토링으로 구분해서 커밋한다.
