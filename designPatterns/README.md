1. Strategy Pattern
   1. Used when sibling child class use similar method. these method should be abstracted and can be used by child classes of base class.
2. Observer Pattern
   1. used for event bases scenario like getting notification when new stocks comes
   2. Observable interface(with list of observers to update) + observer interface(with oberservable instance to get info about new update)
3. Decorator Pattern
    1. Base class + Decorator class(with is-a and has-a relation)
   2. Both Base class and Decorator class should be abstract
4. Factory Pattern:
   1. Used when conditional obj needs to be created.
   2. Abstract factory is used when factory class can have different tyeps of factory