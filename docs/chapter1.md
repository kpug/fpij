# 함수형 프로그래밍

함수형 프로그래밍이란 프로그래밍 패러다임으로, 함수로 프로그래밍하는 것이다. 그러나 이것만으로는 함수형 프로그래밍이 다른 패러다임과 어떻게 다르며, 어떻게 프로그램을 더 견고하게 만드는지 설명하기엔 부족하다.

1990년에 작성된 "Why Functional Programming Matters"에서 더 깊이 있는 내용을 탐구할 수 있다. 
https://www.cs.kent.ac.uk/people/staff/dat/miranda/whyfp90.pdf

함수형 프로그래밍은 객체지향 프로그래밍에 반대되는 개념은 아니다. 몇몇 함수형 프로그래밍 언어는 객체지향적이다.

함수형 프로그래밍의 주요 특징은 아래와 같다.

* First-class functions
* Anonymous functions
* Closures
* Currying
* Lazy evaluation
* Parametric polymorphism
* Algebraic data types

함수형 프로그래밍에서 중요한 점중 하나로 프로그램에 부수효과를 제거를 들 수 있다.

* No mutation of variables
* No printing to the console or to any device
* No writing to files, databases, networks, or whatever
* No exception throwing

프로그램의 부수효과를 제거하면 프로그램은 훨씬 더 안전해진다. 그러나 프로그램 전체에 대해서 부수효과를 제거할 순 없다.

## 참조 투명성

코드가 변경할 수 없고 외부 세계에 의존적이지 않을 때 참조 투명하다고 말할 수 있다.

* It's self-contained.
* It's deterministic, which means it will always return the same value for the same argument.
* It will never throw any kind of Exception.
* It won't create conditions causing other code to unexpectedly fail.
* It won't hang.

## 함수형 프로그래밍의 장점

* Functional programs are easier to reason about.
* Functional programs are easier to test.
* Functional programs are more modular.
* Functional programs makes composition and recombination much easier.