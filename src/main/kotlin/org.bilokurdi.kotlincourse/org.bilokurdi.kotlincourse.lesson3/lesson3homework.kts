package com.DariaBi

import java.time.LocalDateTime

val eventName: String = "Hackathon Survival" // Название мероприятия

val eventPlace: String = "Moscow, General street,7" // Адрес мероприятия

val badget: Int = 500 000 // Бюджет

val timing: Int = 6// Длительность хакатона

val eventInformation: String = "Hacaton information list" // Контанктная информация и тп

val sponsor: String = "Sponsor" // Список спонсоров

val teams: String = "Teams" // Список команд

val tasksToDo: String = "What to do" // Перечнь задач

val confidencePolicy: String = "Confidence policy" // Политика конфиденциальности

val jury: String = "Jury list" //Список жюри

val eventNumber: Int = 12345678 // Регистрационный номер мероприятия

val moodRate: String by lazy { "" } // Измерение уровня настроения опросом

val evacuationRules: String = "Picture of the evacuation plan" // План эвакуации



var dateTime: String = "20.12.2025" // Дата проведения мероприятия

var teams: Int = 0
    get() = field
    private set(value) {field=value} // Кол-во участников

var status: String = "Ready to start"  //Статус хакатона

var internetConnectionRate: Int = 0 // Уровень интернета

var transportationInformation: String = "List of the transportation information" // Информация о транспортировке

var avalibleEquipment: String = "List of the equipment" // Список доступного оборудования

var spareEquipment: String = "List of the spare equipment" // Список свободного оборудования

var lightLevel: Int = 0 // Уровень освещения


