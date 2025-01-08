package pro.shamilabd.pastebin;

import java.util.List;
import java.util.Map;

public class OrderService {
    /**
     * Возвращает map вида [валюта (в порядке возрастания разницы) - разница между самым
     * большим и маленьким заказом типа DELIVERY для валюты].
     * Если по какой-то валюте только один заказ, то он является и самым большим и самым
     * маленьким и разница равна 0.
     * * Пример входных данных:
     * <p>
     * * Order(DELIVERY, "EUR", 2000),
     * * Order (DELIVERY, "USD", 15),
     * * Order (DELIVERY, "RUB", 200),
     * * Order (PICKUP, "RUB", 1250),
     * * Order (DELIVERY, "USD", 35),
     * * Order (PICKUP, "USD", 55),
     * * Order (DELIVERY, "RUB", 100)
     * -1
     * <p>
     * * Ожидаемый результат:
     * ["EUR"-> 0.0, "USD" -> 20.0, "RUB"-> 100.0]
     */
    static Map<String, Double> getMaxMinusMinDeliveryMapByCurrency(List<OrderData> orderDataList) {
        // TODO: реализовать
        return Map.of();
    }

    enum Type {DELIVERY, PICKUP}

    static class OrderData {
        final Type type;
        final String currency;
        final Long amount;

        OrderData(Type type,
                  String currency,
                  Long amount) {
            this.type = type;
            this.currency = currency;
            this.amount = amount;
        }

        String getCurrency() {
            return currency;
        }

        Long getAmount() {
            return amount;
        }

        Type getType() {
            return type;
        }
    }
}
