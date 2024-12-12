<template>

    <v-data-table
        :headers="headers"
        :items="stockHistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'StockHistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            stockHistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/stockHistories'))

            temp.data._embedded.stockHistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.stockHistory = temp.data._embedded.stockHistories;
        },
        methods: {
        }
    }
</script>

