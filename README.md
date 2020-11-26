## Spring Boot

1. Сгененировать новый проект Spring Boot с использованием https://start.spring.io/ или Idea
2. Добавить при генерации проекта следующие dependency: Web, testing, Jpa, Actuator, lombok(опционально)
3. Добавить Spring Data репозиторий - интерфейс без имплементации для доступа к данным. В качестве данных использовать таблицу из предыдущих проектов или произвольную.
4. Репозиторий должен содержать не менее двух методов: все сущности из таблицы и одну сущность по id. CRUD операции не нужны. Пейжинация и сортировка будет плюсом но не обязательны
5. Аннотировать класс-модель данных для загрузки из базы данных. Класс должен содержать как минимум два поля id и name
6. Реализовать Rest контроллер который должен содержать два метода: вернуть все сущности и вернуть одну сущность по id. Использовать методы GET. Возможность пейжинации и сортивовки будут плюсом но не обязательны.
7. Сконфигурировать метрики и health. данные должны быть доступны по стандартным путям actuator/health actuator/metrics или переопределенным
7. Имплементировать кастомный healthCheck который помимо статуса приложения UP/DOWN будет возвращать название приложения
9. Опционально: добавить тесты
10. Опционально: использовать lombok