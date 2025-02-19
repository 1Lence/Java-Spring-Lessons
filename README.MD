[Петров Кирилл Антонович
Преподаватель: Иванов Никита

Задание Spring-Boot_Application:

Сама SpringBootApplication должна быть в стартер классе
exclude - Исключает указанные классы из автоматической настройки
Пр. @SpringBootApplication(exclude = {SomeClass.class})

excludeName - Исключает классы по их полным именам
Пр. @SpringBootApplication(excludeName = {"org.springframework.boot.autoconfigure.jdbc.SomeClass")

scanBasePackages - Задает пакеты для сканирования
Пр. @SpringBootApplication(scanBasePackages = {"com.example.Demo"})

scanBasePackageClasses - Указывает пакеты для сканирования через классы
Пр. @SpringBootApplication(scanBasePackageClasses = {Demo.class})

proxyBeanMethods - создает прокси-классы для методов @Bean. Это значит, что если один бин зависит от другого, 
Spring гарантирует, что будет использован один и тот же экземпляр. [true, false]

nameGenerator - генератор имён бинов, можно сделать кастомный и переопределить