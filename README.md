
# Problem 1 - global exports cannot be referenced after load

```
clj -m cljs.main -co compiler-opts.cljs.edn -c exports  -re node  --repl
```

at the repl:

```
(require 'exports')

exports/foo-ref

```
see that the println statement executes as expected, but the var 'foo-ref' has no value


# Problem 2 - scoped packages do not work as global exports

```
clj -m cljs.main -co compiler-opts-scoped.cljs.edn -c scoped-exports  -re node  --repl
```


at the repl:

```
(require 'scoped-exports')

```

boom!