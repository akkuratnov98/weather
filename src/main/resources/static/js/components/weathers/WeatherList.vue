<template>
    <div>
    <weather-row v-for="weather in weathers" :key="weather.id" :weather="weather"/>
    </div>
</template>

<script>
    import WeatherRow from '../weathers/WeatherRow.vue'

    export default {
        props: ['weathers'],
        components: {
            WeatherRow
        },
        data(){
            return{
                weather: null
            }
        }
        // created: function () {
        //     weatherApi.get().then(result =>
        //         result.json().then(data =>
        //             data.forEach(weather => this.weathers.push(weather))
        //         )
        //     )
        // }
    }
</script>

<style>

</style>