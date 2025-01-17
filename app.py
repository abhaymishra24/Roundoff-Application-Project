# import requests


# # Replace these with your actual API details
# API_URL = 'https://api.examplepaymentgateway.com/v1/charges'  # Example endpoint
# API_KEY = 'your-api-key'

# def make_payment(amount, currency, description, card_number, card_expiry, card_cvc):
#     # Prepare the data to be sent in the request
#     data = {
#         'amount': amount,
#         'currency': currency,
#         'description': description,
#         'payment_method': {
#             'card_number': card_number,
#             'card_expiry': card_expiry,
#             'card_cvc': card_cvc
#         }
#     }

#     # Convert the data to JSON format
#     json_data = json.dumps(data)

#     # Set up the headers
#     headers = {
#         'Authorization': f'Bearer {API_KEY}',
#         'Content-Type': 'application/json'
#     }

#     # Make the POST request
#     response = requests.post(API_URL, headers=headers, data=json_data)

#     # Check if the request was successful
#     if response.status_code == 200:
#         return response.json()
#     else:
#         raise Exception(f"Payment failed with status code {response.status_code}: {response.text}")

# if __name__ == '__main__':
#     try:
#         # Example payment details
#         result = make_payment(
#             amount=1000,
#             currency='USD',
#             description='Payment for Order #12345',
#             card_number='4111111111111111',
#             card_expiry='12/25',
#             card_cvc='123'
#         )
#         print("Payment successful:", result)
#     except Exception as e:
#         print("Error:", e)

