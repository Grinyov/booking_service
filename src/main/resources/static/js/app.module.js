/**
 * Created by green.
 */

(function () {
    'use strict';

    angular
        .module('app')
        .controller('BookingsController', BookingsController);

    BookingsController.$inject = [];

    function BookingsController($http) {
        var vw = this;
        vm.getAll = getAll;
        vm.getAffordable = getAffordable;
        vm.deleteBooking = deleteBooking;


        vm.bookings = [];

        init();

        function init() {
            getAll();
        }

        function getAll() {
            var url = "/bookings/all";
            var bookingsPromise =$htpp.get(url);
            bookingsPromise.then(function (response) {
                vm.bookings = response.data;
            });
        }

        function getAffordable() {
            var url = "/bookings/affordable/" + 100;
            var bookingsPromise =$htpp.get(url);
            bookingsPromise.then(function (response) {
                vm.bookings = response.data;
            });
        }

        function deleteBooking(id) {
            var url = "/bookings/delete/" + id;
            $http.post(url).then(function (response) {
                vm.bookings = response.data;
            });
        }


    }
});