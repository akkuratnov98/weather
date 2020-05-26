<template>
   <div>
   <weather-list :weathers="weathers" />
   </div>
</template>

<script>
   import WeatherList from '../components/weathers/WeatherList.vue'
   export default {
      components: {
         WeatherList
      },
      data() {
         return{
            weathers: frontendData.weathers
         }
      }
   }
</script>

<style>

</style>