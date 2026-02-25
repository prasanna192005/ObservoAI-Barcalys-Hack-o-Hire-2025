# 👁️ ObservoAI — The AI-Powered API Watchdog

[![Demo](https://img.shields.io/badge/Demo-Watch%20Now-red?style=for-the-badge&logo=youtube)](https://youtu.be/v2XaY78f0vQ)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Status: Superpowered](https://img.shields.io/badge/Status-Superpowered-blue?style=for-the-badge)](https://github.com/prasanna192005/ObservoAI)

**ObservoAI** isn't just a monitoring tool; it's the Sherlock Holmes of your distributed systems. Whether your APIs are chilling on-prem, floating in the cloud, or lost in a multi-cloud maze, ObservoAI keeps its AI-powered eyes peeled for trouble.

It delivers real-time health insights, predictive analytics, and even makes phone calls (yes, actual calls!) when things go south. All visualized in a gorgeous Grafana dashboard with a sleek Next.js frontend.

---

## 🚀 Superpowers (Features)

- **🌍 Omnipresent Monitoring**: Tracks APIs across on-prem, cloud, and multi-cloud environments.
- **💰 Bank API Simulation**: Includes a realistic, high-frequency transaction API to simulate complex request journeys. Perfect for stress testing your infrastructure.
- **🧠 3-Tier Anomaly Detection**:
  - **ARIMA**: Forecasting trend shifts like a pro.
  - **LSTM**: Deep learning to spot performance degradation before users do.
  - **Isolation Forest**: Sniffs out those rare, "black swan" anomalies.
- **💬 Chat with your Logs**: Don't just read logs—interrogate them! Query metrics and traces interactively using PromQL and TraceQL through our chat interface.
- **🕵️ Root Cause Analysis (RCA)**: LLM-powered analysis that tells you *why* things broke, not just that they did. It can even email you reports automatically.
- **📞 AI-Driven Phone Alerts**: Critical incidents? Our AI will literally call you. No more sleeping through important pagers.
- **📈 Predictive Analytics**: Forecasts upcoming failures and their impact on the full request journey.
- **🚨 Environment-Aware Alerts**: Email, AI calls, and dashboard pings tailored to your specific environment.
- **🐳 Scalable & Portable**: Fully Dockerized. Scale it up or move it around with ease.

---

## 🛠️ The Gear (Tech Stack)

### **Backend & AI**
- ![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white) **Python/FastAPI**: The brains of the operation.
- ![ML](https://img.shields.io/badge/ML-ARIMA%20|%20LSTM%20|%20Isolation%20Forest-orange?style=flat-square) **Scikit-learn, TensorFlow/PyTorch**: For the heavy-lifting anomaly detection.
- ![OTEL](https://img.shields.io/badge/OTEL-OpenTelemetry-blue?style=flat-square) **OpenTelemetry SDKs**: Instrumented for maximum visibility.
- ![LLM](https://img.shields.io/badge/LLM-Gemini%20|%20RCA-green?style=flat-square) **LLM**: For Root Cause Analysis & automated reporting.

### **The Observability Stack**
- ![Loki](https://img.shields.io/badge/Loki-Log%20Aggregation-grey?style=flat-square) **Loki**: Log aggregation.
- ![Prometheus](https://img.shields.io/badge/Prometheus-Metrics-E6522C?style=flat-square&logo=prometheus&logoColor=white) **Prometheus**: Metrics storage (PromQL).
- ![Tempo](https://img.shields.io/badge/Tempo-Traces-lightgrey?style=flat-square) **Tempo**: Distributed tracing (TraceQL).
- ![Grafana](https://img.shields.io/badge/Grafana-Visualization-F46800?style=flat-square&logo=grafana&logoColor=white) **Grafana**: Stunning custom dashboards & AI metrics visualization.

### **Frontend & Infra**
- ![Next.js](https://img.shields.io/badge/Next.js-Frontend-black?style=flat-square&logo=next.js&logoColor=white) **Next.js**: Responsive, interactive UI.
- ![Docker](https://img.shields.io/badge/Docker-Containers-2496ED?style=flat-square&logo=docker&logoColor=white) **Docker**: Easy deployment.

---

## 🏗️ Getting Started (The Mission Briefing)

### 1. Gear Up
Install the dependencies:
```bash
npm install
```

### 2. Launch the Mother Ship
Start all services (Collectors, Databases, AI Services) using Docker Compose:
```bash
docker-compose up -d
```

### 3. Deploy the API
Run the Node.js application (if not already handled by Docker):
```bash
node index.js
```

### 4. Unleash Chaos (Load Testing)
Generate traffic and simulate real-world usage:
```bash
docker-compose run load-tester
# OR for the banking simulator
node banking-services/generate-test-data.js
```

---

## 📊 Where to Watch the Magic

- **Kibana (Logs & Traces)**: [http://localhost:5601](http://localhost:5601)
- **Prometheus (Metrics)**: [http://localhost:9090](http://localhost:9090)
- **Grafana (The Control Room)**: [http://localhost:3005](http://localhost:3005) (User: `admin`, Pass: `admin`)
- **API Health Check**: [http://localhost:8080/health](http://localhost:8080/health)
- **Roll the Dice (Generate Traces)**: [http://localhost:8080/rolldice](http://localhost:8080/rolldice)

---

## 📌 Why ObservoAI?

Distributed systems are messy. Cloud, on-prem, hybrid... it’s a lot to handle. **ObservoAI** solves this by:
1.  **Spotting the Invisible**: Using ML to find anomalies that traditional thresholds miss.
2.  **Bridging the Gap**: Integrating metrics and traces directly into Grafana for instant context.
3.  **Talking Back**: AI-driven phone calls and RCA reports mean you're always informed.
4.  **Scaling with You**: Dockerized and ready for any environment.

---

## 📝 Troubleshooting

If the ship hits an iceberg, check the logs:
```bash
docker logs otel-collector
docker logs elasticsearch
docker logs prometheus
docker logs grafana
```

---

*Built with ❤️ by the chadCN Team.*
