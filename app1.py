


# In this code we will count how many time payment done by each payment gateways.

# Find out transaction data from different payment system.

transactions = [
    {"gateway": "Paytm"},
    {"gateway": "GPay"},
    {"gateway": "PhonePe"},
    {"gateway": "Paytm"},
    {"gateway": "GPay"},
    {"gateway": "PhonePe"},
    {"gateway": "Paytm"},
]

# Function to count payments by gateway
def count_payments(transactions):
    payment_count = {}
    
    for transaction in transactions:
        gateway = transaction["gateway"]
        if gateway in payment_count:
            payment_count[gateway] += 1
        else:
            payment_count[gateway] = 1
            
    return payment_count

# Count payments and print the result
payment_summary = count_payments(transactions)
print(payment_summary)
