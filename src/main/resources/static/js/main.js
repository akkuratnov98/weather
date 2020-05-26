import Vue from 'vue'
import VueResource from 'vue-resource'
import App from 'pages/App.vue'

Vue.use(VueResource)

new Vue({
    el: '#app',
    render: a => a(App)
})

/*var weatherApi = Vue.resource('/weather{/id}');

Vue.component('weather-row', {
    props: ['weather'],
    template: '<div>' +
        '<i>({{ weather.id }})</i>' +
        '{{ weather.temperature}} {{ weather.creationDate }}'+
        '</div>'
})

Vue.component('weather-list', {
    props: ['weathers'],
    template:
        '<div>'+
            '<weather-row v-for="weather in weathers" :key="weather.id" :weather="weather"/>' +
        '</div>',
    created: function () {
        weatherApi.get().then(result =>
            result.json().then(data =>
                data.forEach(weather => this.weathers.push(weather))
            )
        )
    }
    
});*/

/*
var app = new Vue({
    el: '#start',
    template: '<weather-list :weathers="weathers" />',
    data: {
        weathers: []
    }
});*/
