# Что происходит?
Для примеров кода в примерах используется [mdoc](https://scalameta.org/mdoc/):  
в папке [docs](./docs) лежат Markdown-файлы, которые затем "компилируются" Mdoc-ом и попадают в папку [kaska-docs/target/mdoc](./kaska-docs/target/mdoc).

C помощью Github-Pages рендерится файл [README.md](./README.md), в котором прописаны ссылки до скомпилированных файлов с информацией.

# Как с этим удобно работать?

Для работы необходимо иметь [SBT](https://www.scala-sbt.org/) и &mdash; если хочется написать код для библиотеки &mdash; редактор кода или IDE для Scala.  
Также понадобится способ смотреть отрендеренные локально Markdown файлы так, чтобы превью еще автоматически обновлялось при изменении файла на диске.
Я использую для этого [Markdown Viewer](https://chrome.google.com/webstore/detail/markdown-viewer/ckkdlimhmcjmikdlpkmbgfkaikojcbjk?hl=en).

# Что делать?
* Склонировать репозиторий
* В корне запустить команду `sbt`
* Выполнить команду `docs/mdoc --watch`
* Открыть превью нужного файла из папки [kaska-docs/target/mdoc](./kaska-docs/target/mdoc)
* Редактировать файлы в папке [docs](./docs) 
