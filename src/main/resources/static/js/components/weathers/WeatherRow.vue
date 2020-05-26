<template>
    <div>
    <i>({{ weather.id }})</i>
    {{ weather.temperature}} {{ weather.creationDate }}
    </div>
</template>

<script>
    export default {
        props: ['weather']
    }

</script>

<style>

</style>