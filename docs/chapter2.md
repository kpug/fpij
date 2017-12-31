# 함수란 무엇인가?

수학에서 함수는 정의역에서 치역으로 사상되는 관계를 말한다.

## 역함수(inverse functions)

함수 f가 A가 B로 사상될 때, 반대로 B가 A로 사상되는 함수 f^-1을 함수 f의 역함수라 한다. 모든 함수에 역함수가 존재하는 것은 아니다.
예로 f(x) = (2 * x) 함수는 역함수가 존재하지 않는다.

## 부분함수(patial function)

도메인의 모든 요소에 대해서는 정의되지 않았지만 나머지 요구수항을 충족시키는 관계를 부분 함수라 한다.

## 함수 합성(function compsition)

두 함수를 합성하여 하나의 함수처럼 사용할 수 있다. 두 함수 f, g가 있을 때 합성함수 f o g로 표시하며 f round g 로 읽는다.
f(x) = x + 2이고 g(x) = x * 2 이면, f o g = f(g(x)) = f(x * 2) = (x * 2) + 2 이다.

## 여러 인자를 갖는 함수

함수의 정의를 다시 살펴보면, 함수는 오직 하나의 정의역만 갖는 것임을 알 수 있다. f(x, y) = x + y 와 같은 함수 역시 x, y를 쌍(pair)로 묶어서 생각해보면 f((x, y)) = x + y 로 나타낼 수 있고, 이것이 바로 함수이다.

## 커링 함수(Function currying)

튜플의 함수 f((x, y)) = x + y의 경우, g(y)가 x + y 라고 한다면 f(x)(y) = g(y)로 나타낼 수 있다. 이 경우 f(x) = g이며, g(y) = x + y 이다. (3, 5)를 대입하면, f(3)(5) = g(5) = 3 + 5 = 8 이다.
위와 같은 경우 f(x)(y)를 f(x, y)의 커리 형태라 한다.

## 부분 적용 함수(Partially applied functions)

커리 형태의 함수의 경우에 특정 요소를 미리 적용하여 새로운 함수를 생성할 수 있다. 

# 참고자료

Scala의 partially applied function과 partial function 이해하기[https://blog.outsider.ne.kr/953]