(function Singleton() {
    let instance;

    createInstance_ = () => {
        return {
            name: 'NAME',
            sayName: () => {
                console.log("NAME");
            },
        };
    };

    return {
        getInstance: () => {
            if (!instance) {
                instance = createInstance_();
            };
            return instance;
        },
    };
})();