# MiniProjectBDD

## Описание
Проект демонстрирует BDD с Cucumber и Gherkin + автотест на Java с Selenium.

## Запуск:
```bash
mvn test
```

## Структура:
- `*.feature` — Gherkin-сценарии
- `LoginSteps.java` — реализация шагов
- `CucumberTestRunner.java` — запуск тестов

## Что проверяет:
Логин на https://the-internet.herokuapp.com/login с валидными данными.
