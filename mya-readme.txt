create submodule 'demo'

then create 'BookDao' class with same package name 'gradle.multi.module.project'

build 'demo' project

then include 'demo' project in 'settings.gradle' like this

then include 'demo' dependencies in 'build.gradle' like this

build parent gradle project and make sure 'demo' jar is inculded in 'parent' module after building time

now,we can invoke or call method called 'getBooks' from other submodule 'demo'.

finally, we can print getting books by running main application of parent module 'app' module.