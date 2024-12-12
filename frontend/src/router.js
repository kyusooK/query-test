
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderOrderManager from "./components/listers/OrderOrderCards"
import OrderOrderDetail from "./components/listers/OrderOrderDetail"

import GetOrderView from "./components/GetOrderView"
import GetOrderViewDetail from "./components/GetOrderViewDetail"
import InventoryInventoryManager from "./components/listers/InventoryInventoryCards"
import InventoryInventoryDetail from "./components/listers/InventoryInventoryDetail"

import GetInventoryView from "./components/GetInventoryView"
import GetInventoryViewDetail from "./components/GetInventoryViewDetail"
import StockHistoryView from "./components/StockHistoryView"
import StockHistoryViewDetail from "./components/StockHistoryViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders/orders',
                name: 'OrderOrderManager',
                component: OrderOrderManager
            },
            {
                path: '/orders/orders/:id',
                name: 'OrderOrderDetail',
                component: OrderOrderDetail
            },

            {
                path: '/orders/getOrders',
                name: 'GetOrderView',
                component: GetOrderView
            },
            {
                path: '/orders/getOrders/:id',
                name: 'GetOrderViewDetail',
                component: GetOrderViewDetail
            },
            {
                path: '/inventories/inventories',
                name: 'InventoryInventoryManager',
                component: InventoryInventoryManager
            },
            {
                path: '/inventories/inventories/:id',
                name: 'InventoryInventoryDetail',
                component: InventoryInventoryDetail
            },

            {
                path: '/inventories/getInventories',
                name: 'GetInventoryView',
                component: GetInventoryView
            },
            {
                path: '/inventories/getInventories/:id',
                name: 'GetInventoryViewDetail',
                component: GetInventoryViewDetail
            },
            {
                path: '/inventories/stockHistories',
                name: 'StockHistoryView',
                component: StockHistoryView
            },
            {
                path: '/inventories/stockHistories/:id',
                name: 'StockHistoryViewDetail',
                component: StockHistoryViewDetail
            },


    ]
})
