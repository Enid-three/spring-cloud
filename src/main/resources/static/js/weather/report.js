$(function () {
    $("#selectCityId").change(function () {
        window.location.href = "/report/cityId/" + $("#selectCityId").val();
    })
});