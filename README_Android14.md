# USAGE

App module add dependencies:
```
debugImplementation("io.github.shiqos:wytrace:1.1.0")
releaseImplementation("io.github.shiqos:wytrace-no-impl:1.1.0")
```

Application.onCreate call
```
ArtMethodTrace.fix14debugApp(<Application>);
```

You can also refer to the app module