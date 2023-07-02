package com.example.quizzi;

import java.util.ArrayList;
import java.util.List;

public class QuestiomsBamk {

    private static List<QuestionsList> mediumQuestions () {

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Какая команда выиграла Чемпионат мира по футболу в 2018 году?",
                "Франция.", "Бразилия.", "Германия.", "Испания.",
                "Франция.", "");

        final QuestionsList question2 = new QuestionsList("Кто является рекордсменом по количеству золотых медалей на Олимпийских играх?",
                "Michael Phelps.", "Usain Bolt.", "Simone Biles.", "Serena Williams.",
                "Michael Phelps.", "");

        final QuestionsList question3 = new QuestionsList("Какой спортсмен стал чемпионом мира по боксу в супертяжелом весе в 2021 году?",
                "Anthony Joshua.", "Tyson Fury.", "Deontay Wilder.", "Oleksandr Usyk.",
                "Oleksandr Usyk.", "");

        final QuestionsList question4= new QuestionsList("Какое соревнование считается самым престижным в мировом теннисе?",
                "Australian Open.", "Wimbledon.", "French Open.", "US Open.",
                "Wimbledon.", "");

        final QuestionsList question5 = new QuestionsList("Какая страна выиграла Чемпионат мира по хоккею в 2018 году?",
                "Россия.", "Канада.", "Швеция.", "Финляндия.",
                "Канада.", "");

        final QuestionsList question6 = new QuestionsList("Какой спортсмен считается \"королем теннисных кортов\"?",
                "Roger Federer.", "Rafael Nadal.", "Novak Djokovic.", "Andy Murray.",
                "Roger Federer.", "");

        final QuestionsList question7 = new QuestionsList("Какая страна является рекордсменом по количеству побед на Кубке мира по футболу?",
                "Бразилия.", "Германия.", "Италия.", "Аргентина.",
                "Бразилия.", "");

        final QuestionsList question8 = new QuestionsList("Какая команда выиграла Лигу чемпионов УЕФА в сезоне 2020/2021?",
                "Manchester City.", "Chelsea.", "Real Madrid.", "Bayern Munich.",
                "Chelsea.", "");

        final QuestionsList question9 = new QuestionsList("Какой спортсмен считается \"королем плавания\"?",
                "Michael Phelps.", "Ryan Lochte.", "Ian Thorpe.", "Caeleb Dressel.",
                "Michael Phelps.", "");

        final QuestionsList question10 = new QuestionsList("Какой спортсмен выиграл наибольшее количество титулов в гольфе?",
                "Tiger Woods.", "Jack Nicklaus.", "Arnold Palmer.", "Phil Mickelson.",
                "Jack Nicklaus.", "");

        final QuestionsList question11 = new QuestionsList("Какая страна выиграла Чемпионат мира по баскетболу в 2019 году?",
                "США.", "Россия.", "Испания.", "Аргентина.",
                "Аргентина.", "");

        final QuestionsList question12 = new QuestionsList("Какой спортсмен считается лучшим бегуном на длинные дистанции?",
                "Usain Bolt.", "Mo Farah.", "Eliud Kipchoge.", "Haile Gebrselassie.",
                "Eliud Kipchoge.", "");

        final QuestionsList question13 = new QuestionsList("Какая команда выиграла Кубок мира по регби в 2019 году?",
                "Новая Зеландия.", "Англия.", "ЮАР.", "Австралия.",
                "Англия.", "");

        final QuestionsList question14 = new QuestionsList("Какой спортсмен выиграл наибольшее количество титулов на Открытом чемпионате Австралии по теннису?",
                "Roger Federer.", "Novak Djokovic.", "Rafael Nadal.", "Pete Sampras.",
                "Novak Djokovic.", "");

        final QuestionsList question15 = new QuestionsList("Какой город был хозяином Олимпийских игр 2016 года?",
                "Лондон, Великобритания.", "Рио-де-Жанейро, Бразилия.", "Пекин, Китай.", "Афины, Греция.",
                "Рио-де-Жанейро, Бразилия.", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        questionsList.add(question11);
        questionsList.add(question12);
        questionsList.add(question13);
        questionsList.add(question14);
        questionsList.add(question15);


        return questionsList;
    }

    private static List<QuestionsList> easyQuestions () {

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Какое из следующих спортивных мероприятий проводится каждые четыре года?",
                "Олимпийские игры.", "Чемпионат мира по футболу.", "Чемпионат мира по хоккею.", "Тур де Франс.",
                "Олимпийские игры.", "");

        final QuestionsList question2 = new QuestionsList("Какой гольфист завоевал наибольшее количество зеленых курток на Турнире мастеров?",
                "Tiger Woods.", "Jack Nicklaus.", "Arnold Palmer.", "Phil Mickelson.",
                "Jack Nicklaus.", "");

        final QuestionsList question3 = new QuestionsList("В каком спортивном виде используется термин \"баскетбол\"?",
                "Бейсбол.", "Баскетбол.", "Футбол.", "Гольф.",
                "Баскетбол.", "");

        final QuestionsList question4= new QuestionsList("Кто является рекордсменом по количеству забитых голов в истории футбола?",
                "Cristiano Ronaldo.", "Lionel Messi.", "Pele.", "Romario.",
                "Cristiano Ronaldo.", "");

        final QuestionsList question5 = new QuestionsList("Какое международное футбольное соревнование проводится каждые четыре года?",
                "Лига чемпионов УЕФА.", "Кубок мира FIFA.", "Кубок Конфедераций FIFA.", "Кубок Америки.",
                "Кубок мира FIFA.", "");

        final QuestionsList question6 = new QuestionsList("Какое из следующих спортивных мероприятий проводится каждую весну в США?",
                "Уимблдон.", "Открытый чемпионат Австралии по теннису.", "Мастерс по гольфу.", "Марафон Бостона.",
                "Мастерс по гольфу.", "");

        final QuestionsList question7 = new QuestionsList("В какой стране родился легендарный футболист Диего Марадона?",
                "Бразилия.", "Аргентина.", "Италия.", "Германия.",
                "Аргентина.", "");

        final QuestionsList question8 = new QuestionsList("Какой спортсмен является рекордсменом по количеству побед на Тур де Франс?",
                "Lance Armstrong.", "Eddy Merckx.", "Miguel Indurain.", "Chris Froome.",
                "Eddy Merckx.", "");

        final QuestionsList question9 = new QuestionsList("В каком спортивном виде используется термин \"лыжня\"?",
                "Биатлон.", "Фигурное катание.", "Прыжки с трамплина.", "Хоккей.",
                "Биатлон.", "");

        final QuestionsList question10 = new QuestionsList("Какой теннисист выиграл наибольшее количество титулов на турнирах Большого шлема?",
                "Roger Federer.", " Rafael Nadal.", "Novak Djokovic.", "Pete Sampras.",
                "Novak Djokovic.", "");

        final QuestionsList question11 = new QuestionsList("Какая команда является рекордсменом по количеству побед в Лиге чемпионов УЕФА?",
                "Real Madrid.", "Barcelona.", "Bayern Munich.", "Manchester United.",
                "Real Madrid.", "");

        final QuestionsList question12 = new QuestionsList("В каком году проходили первые современные Олимпийские игры?",
                "1884.", "1896.", "1904.", "1920.",
                "1896.", "");

        final QuestionsList question13 = new QuestionsList("Какой боксер считается самым тяжелым в истории, завоевав все возможные пояса в супертяжелом весе?",
                "Mike Tyson.", "Lennox Lewis.", "Evander Holyfield.", "Wladimir Klitschko.",
                "Wladimir Klitschko.", "");

        final QuestionsList question14 = new QuestionsList("Какая страна является рекордсменом по количеству выигранных чемпионатов мира по хоккею?",
                "Канада.", "СССР/Россия.", "Чехия.", "Швеция.",
                "СССР/Россия.", "");

        final QuestionsList question15 = new QuestionsList("Какой гандболист является рекордсменом по количеству забитых голов на международной арене?",
                "Nikola Karabatic.", " Luc Abalo.", "Thierry Omeyer.", "Mikkel Hansen.",
                "Mikkel Hansen.", "");



        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        questionsList.add(question11);
        questionsList.add(question12);
        questionsList.add(question13);
        questionsList.add(question14);
        questionsList.add(question15);


        return questionsList;
    }

    private static List<QuestionsList> hardQuestions () {

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("В каком году была основана футбольная команда ЦСКА?",
                "1895.", "1901.", "1911.", "1923.",
                "1911.", "");

        final QuestionsList question2 = new QuestionsList("Какое количество раз команда ЦСКА выигрывала Чемпионат России по футболу?",
                "3.", "5.", "7.", "10.",
                "7.", "");

        final QuestionsList question3 = new QuestionsList("Кто является рекордсменом по количеству забитых голов за ЦСКА?",
                "Sergei Ignashevich.", "Vágner Love.", "Alan Dzagoev.", "Igor Akinfeev.",
                "Vágner Love.", "");

        final QuestionsList question4= new QuestionsList("Кто из этих игроков не является выпускником академии ЦСКА?",
                "Aleksandr Golovin.", "Alan Dzagoev.", "Fyodor Chalov.", "Artem Dzyuba.",
                "Artem Dzyuba.", "");

        final QuestionsList question5 = new QuestionsList("Какая команда считается главным соперником ЦСКА?",
                "Спартак Москва.", "Зенит Санкт-Петербург.", "Локомотив Москва.", "Рубин Казань.",
                "Спартак Москва.", "");

        final QuestionsList question6 = new QuestionsList("Какое место занимает стадион \"ВЭБ-Арена\" в Москве, домашняя арена ЦСКА, по вместимости среди стадионов России?",
                "Первое.", "Второе.", "Третье.", "Четвертое.",
                "Первое.", "");

        final QuestionsList question7 = new QuestionsList("Кто является рекордсменом по количеству сыгранных матчей за ЦСКА?",
                "Sergey Semak.", " Igor Akinfeev.", "Vasily Berezutskiy.", "Aleksey Berezutskiy.",
                " Igor Akinfeev.", "");

        final QuestionsList question8 = new QuestionsList("Какое количество раз ЦСКА выигрывала Кубок России?",
                "3.", "5.", "7.", "10.",
                "7.", "");

        final QuestionsList question9 = new QuestionsList("Кто из этих тренеров не возглавлял ЦСКА?",
                "Leonid Slutsky.", "Valery Gazzaev.", "Viktor Goncharenko.", "Andre Villas-Boas.",
                "Andre Villas-Boas.", "");

        final QuestionsList question10 = new QuestionsList("Какое место занимает ЦСКА в историческом рейтинге клубов УЕФА по итогам сезона 2020/2021?",
                " 10-е.", "20-е.", " 30-е.", "40-е.",
                " 10-е.", "");

        final QuestionsList question11 = new QuestionsList("Какой тренер привел ЦСКА к победе в Лиге Европы в сезоне 2004/2005?",
                "Valery Gazzaev.", "Leonid Slutsky.", "Viktor Goncharenko.", "Igor Shalimov.",
                "Valery Gazzaev.", "");

        final QuestionsList question12 = new QuestionsList("Кто является рекордсменом по количеству забитых голов за ЦСКА в одном сезоне Российской Премьер-лиги?",
                "Vágner Love.", "Seydou Doumbia.", "Ahmed Musa.", " Fedor Chalov.",
                "Seydou Doumbia.", "");

        final QuestionsList question13 = new QuestionsList("Какой клуб считается главным соперником ЦСКА в московском дерби?",
                "Спартак Москва.", "Локомотив Москва.", "Динамо Москва.", "Торпедо Москва.",
                "Динамо Москва.", "");

        final QuestionsList question14 = new QuestionsList("Какой игрок ЦСКА является рекордсменом по количеству голов в одном матче Лиги чемпионов УЕФА?",
                "Seydou Doumbia.", "Vágner Love.", "Alan Dzagoev.", "Ahmed Musa.",
                "Seydou Doumbia.", "");

        final QuestionsList question15 = new QuestionsList("Кто является рекордсменом по количеству сыгранных матчей за ЦСКА в Кубке России?",
                "Igor Akinfeev.", "Sergey Semak.", "Vasily Berezutskiy.", "Aleksey Berezutskiy.",
                "Aleksey Berezutskiy.", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        questionsList.add(question11);
        questionsList.add(question12);
        questionsList.add(question13);
        questionsList.add(question14);
        questionsList.add(question15);


        return questionsList;
    }

    private static List<QuestionsList> hardcoreQuestions () {

        final List<QuestionsList> questionsList = new ArrayList<>();
        //1
        final QuestionsList question1 = new QuestionsList("Какой футбольный клуб является рекордсменом по количеству побед в Лиге чемпионов УЕФА?",
                "Real Madrid.", "Barcelona.", "Bayern Munich.", "AC Milan.",
                "Real Madrid.", "");
        //2
        final QuestionsList question2 = new QuestionsList("Какой игрок является рекордсменом по количеству забитых голов за национальную сборную?",
                "Cristiano Ronaldo.", "Lionel Messi.", "Pele.", "Miroslav Klose.",
                "Cristiano Ronaldo.", "");
        //3
        final QuestionsList question3 = new QuestionsList("Кто является рекордсменом по количеству забитых голов на чемпионатах мира по футболу?",
                "Lionel Messi.", "Cristiano Ronaldo.", "Miroslav Klose.", "Pelé.",
                "Miroslav Klose.", "");
        //4
        final QuestionsList question4= new QuestionsList("Кто является рекордсменом по количеству выигранных \"Золотых мячей\" (Ballon d'Or)?",
                "Lionel Messi.", "Cristiano Ronaldo.", "Michel Platini.", "Johan Cruyff.",
                "Lionel Messi.", "");
        //5
        final QuestionsList question5 = new QuestionsList("Кто из этих футболистов не выступал за клуб \"Manchester United\"?",
                "Eric Cantona.", "Ryan Giggs.", "Paul Scholes.", "Steven Gerrard.",
                "Steven Gerrard.", "");
        //6
        final QuestionsList question6 = new QuestionsList("Какая команда выиграла первый чемпионат мира по футболу в 1930 году?",
                "Уругвай.", "Бразилия.", "Аргентина.", "Германия.",
                "Уругвай.", "");
        //7
        final QuestionsList question7 = new QuestionsList("Кто является рекордсменом по количеству выигранных Чемпионатов Англии (Premier League)?",
                "Manchester United.", "Liverpool.", "Arsenal.", "Chelsea.",
                "Manchester United.", "");
        //8
        final QuestionsList question8 = new QuestionsList("Кто является рекордсменом по количеству забитых голов за сборную Бразилии?",
                "Ronaldo.", "Romário.", "Pelé.", "Neymar.",
                "Pelé.", "");
        //9
        final QuestionsList question9 = new QuestionsList("Какой футболист является рекордсменом по количеству выигранных Кубков мира по футболу?",
                "Pelé.", "Diego Maradona.", "Zinedine Zidane.", "Ronaldo.",
                "Pelé.", "");
        //10
        final QuestionsList question10 = new QuestionsList("Кто является рекордсменом по количеству забитых голов за один сезон испанской Ла Лиги?",
                "Lionel Messi.", "Cristiano Ronaldo.", "Luis Suárez.", "Telmo Zarra.",
                "Cristiano Ronaldo.", "");

        final QuestionsList question11 = new QuestionsList("Какой футбольный клуб является рекордсменом по количеству выигранных Кубков Англии (FA Cup)?",
                "Arsenal.", "Manchester United.", "Liverpool.", "Chelsea.",
                "Arsenal.", "");

        final QuestionsList question12 = new QuestionsList("Кто является рекордсменом по количеству забитых голов в одном сезоне испанской Ла Лиги?",
                "Lionel Messi.", "Cristiano Ronaldo.", "Hugo Sánchez.", "Telmo Zarra.",
                "Telmo Zarra.", "");

        final QuestionsList question13 = new QuestionsList("Какая команда является рекордсменом по количеству выигранных Кубков Италии (Coppa Italia)?",
                "Juventus.", "AC Milan.", "Inter Milan.", "Roma.",
                "Juventus.", "");

        final QuestionsList question14 = new QuestionsList("Кто является рекордсменом по количеству забитых голов за сборную Германии?",
                "Miroslav Klose.", "Gerd Müller.", "Thomas Müller.", "Jürgen Klinsmann.",
                "Miroslav Klose.", "");

        final QuestionsList question15 = new QuestionsList("Какая команда является рекордсменом по количеству выигранных Кубков Германии (DFB-Pokal)?",
                "Bayern Munich.", "Borussia Dortmund.", "Hamburger SV.", "Schalke 04.",
                "Bayern Munich.", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        questionsList.add(question11);
        questionsList.add(question12);
        questionsList.add(question13);
        questionsList.add(question14);
        questionsList.add(question15);


        return questionsList;
    }



    public static List<QuestionsList> getQuestions (String selectedTopicName){
        switch (selectedTopicName) {
            case "medium" : return mediumQuestions();
            case "easy" : return easyQuestions();
            case "hard" : return hardQuestions();
            default: return hardcoreQuestions();

        }
    }
}
