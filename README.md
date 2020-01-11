## Arcadia

A small, dynamic, language built with Ruby-like syntax and focused on development speed and performance.

### Overview

```RUBY
puts "Welcome to Arcadia"
```

Arcadia is a small dynamic language designed to put the developer experience first while prioritizing efficient utilization of modern computer's multi-core processors and GPUs.

Types include:

Strings, integers, floats, and arrays.

```RUBY
i = 0
while i < 100
  i = i + i
  puts "HI!"
end
``` 

You can define methods:

```RUBY
def honk
    puts "HONK!"
end
```

Empty arrays:

```RUBY
arr = []
```

Variables have types in Arcadia, but can be reassigned:

```RUBY
i = 4
i = "Hello"
```

Type conversions automatically occur and "do the right thing":

```RUBY
i = 4
i = i + 0.5
```

In the above example, the variable `i` begins life holding an integer, but when the float 0.5 is added to it, `i` now holds a float.