
# Описание #

Шаблон проекта веб-приложения (одностраничник).

Серверная часть написана на ClojureScript на платформе Node.js с использованием micro-web-framework Express.

Клиентская часть также пишется на ClojureScript и использует клиентский MVC предоставляемый Ember.ClojureScript

# Установка #

Клонируем репозиторий в свою папку с проектами:

	git clone --depth 2 https://github.com/Chicker/cljs_ember_tem.git <my_project> 
	rm -Rf <my_project>/.git

После клонирования репозитория следует изменить название папки z_crm на название Вашего проекта в файлах Gruntfile и project.clj.

Затем запустить разрешение зависимостей:

	lein deps
	npm install

# Сборка проекта #

Сборка проекта осуществляется при помощи Grunt. Отдельной задачей реализована компиляция ClojureScript в JavaScript при помощи плагина leing-cljsbuild для Lein.

# Запуск #

Сборка и запуск проекта выполняется командой `grunt server`, который:
а) Компилирует серверную и клиентскую часть написанную на ClojureScript в JavaScript.
б) Запускает Node.js в режиме supervisor и автоматически отслеживает изменения в исХодныХ кодаХ (задача watch Grunt и запуск плагина leing cljsbuild в режиме auto).

# Особенности #

Все JS-зависимости (JQuery, Ember и Handlebars) включаются при помощи `<script type="text/javascript" ...` в главный и единственный html-файл приложения index.html.

Доступ этим JS-библиотекам осуществляется из глобального контекста JavaScript, например так: `js/Ember`.
