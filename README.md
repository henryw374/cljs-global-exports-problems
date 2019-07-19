
# Problem 1 - global exports cannot be referenced after load

```
clj -m cljs.main -co compiler-opts.cljs.edn -re node  --repl
```

at the repl:

```
(require 'exports)

; see that the println statement executes as expected... 

exports/foo-ref

; but the var 'foo-ref' has no value

```

# Problem 2 - scoped packages do not work as global exports

```
clj -m cljs.main -co compiler-opts-scoped.cljs.edn -re node  --repl
```


at the repl:

```
(require 'scoped-exports-global-exports)

; => boom!

(require 'scoped-exports-simple)

js/Something

; => yes, the scoped foreign lib has been loaded



```

