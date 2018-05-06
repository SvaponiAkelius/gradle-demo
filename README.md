# io.github.svaponi:gradle-demo

Java/Gradle demo project. The library provides a `io.github.svaponi.demo.DemoService` which exposes a `String getName()` method. The library is published on a remote Maven repository (Artifactory), and then imported by a consumer application. 

Consumer application available under [SvaponiAkelius/gradle-demo-consumer](https://github.com/SvaponiAkelius/gradle-demo-consumer).


### How to

Show Gradle tasks

```bash
gradle tasks --all
```

Build and test project

```bash
gradle clean build
```

Install artifact locally

```bash
gradle clean install
```

> To double check if you installed the artifact, try look for jar files under `~/.m2/repository/${groupId}/${artifactId}/${version}/`, which in our case is `~/.m2/repository/io/github/svaponi/gradle-demo/1.0/`


Install artifact on Artifactory

```bash
gradle clean uploadArchives
```

> To double check if you uploaded the artifact to Artifactory, use the [search/quick](https://artifactory.akelius.com/artifactory/webapp/#/search/quick/) feature from web ui and look for `gradle-demo`.


If you get an error, you probably need to define some config in order to connect to Artifactory.

```bash
echo '
artifactory_baseurl=YOUR_ARTIFACTORY_URL
artifactory_username=YOUR_ACTIVE_DIRECTORY_USER
artifactory_password=********
' > ~/.gradle/gradle.properties
```
> You can also define a local file `./gradle.properties`.

> **ATTENTION**: the properties `artifactory_baseurl`, `artifactory_username` and `artifactory_password` are not standard. They are used only by our `build.gradle`.
