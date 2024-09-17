

from flask import Flask, request, jsonify, render_template
import requests

app = Flask(__name__)

# Replace these with your actual payment gateway API details
PAYMENT_GATEWAY_API_URL = 'https://example-payment-gateway.com/api/charge'
PAYMENT_GATEWAY_API_KEY = 'your-api-key'

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/charge', methods=['POST'])
def charge():
    amount = request.form.get('amount')
    token = request.form.get('token')

    if not amount or not token:
        return jsonify({'error': 'Amount and token are required'}), 400

    response = requests.post(
        PAYMENT_GATEWAY_API_URL,
        json={
            'amount': amount,
            'token': token
        },
        headers={
            'Authorization': f'Bearer {PAYMENT_GATEWAY_API_KEY}',
            'Content-Type': 'application/json'
        }
    )

    if response.status_code == 200:
        return jsonify({'success': 'Payment successful'}), 200
    else:
        return jsonify({'error': 'Payment failed'}), response.status_code

if __name__ == '__main__':
    app.run(debug=True)
